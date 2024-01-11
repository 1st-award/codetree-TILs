from collections import deque

class Susi:
    def __init__(self, name, num):
        self.name = name
        self.num = num

class Customer:
    def __init__(self, name, target_num):
        self.name = name
        self.target_num = target_num
    
    def eat(self, num):
        self.target_num -= num

    def is_done(self):
        return True if self.target_num == 0 else False

class Table:
    def __init__(self, length):
        self.susi_table = deque([{} for _ in range(length)])
        self.customer_table = [None] * length
        self.length = length
        self.susi_num = 0
        self.customer_num = 0
    
    def rotate(self):
        temp = self.susi_table[-1]
        self.susi_table.pop()
        self.susi_table.appendleft(temp)
        # self.run()

    def run(self):
        for idx in range(self.length):
            customer = self.customer_table[idx]
            susi_info = self.susi_table[idx]

            # if customer is not None:
                # print(customer.name, customer.target_num, idx, susi_info)
                # print(susi_info.keys())  
            # else:
                # print("customer none", idx, susi_info)
            if customer is not None and customer.name in susi_info.keys():
                customer.eat(susi_info[customer.name])
                # print(11, susi_info[customer.name], customer.target_num)
                self.remove_susi(idx, customer.name)
                if customer.is_done():
                    table.remove_customer(idx)

    def find_susi(self, table_pos, susi_name):
        for name in self.susi_table[table_pos].keys():
            if susi_name == name:
                return self.susi_table[table_pos][susi_name]
        return None
    
    def append_susi(self, table_pos, susi_name):
        susi = self.find_susi(table_pos, susi_name)
        if susi is None:
            self.susi_table[table_pos][susi_name] = 1
        else:
            self.susi_table[table_pos][susi_name] += 1
        self.susi_num += 1
    
    def remove_susi(self, table_pos, susi_name):
        susi_num = self.susi_table[table_pos][susi_name]
        del self.susi_table[table_pos][susi_name]
        self.susi_num -= susi_num

    def append_customer(self, table_pos, customer):
        self.customer_table[table_pos] = customer
        self.customer_num += 1

    def remove_customer(self, table_pos):
        self.customer_table[table_pos] = None
        self.customer_num -= 1

    def info(self):
        print(self.customer_num, self.susi_num)


L, Q = map(int, input().split())
table = Table(L)
latest_t = 1
for _ in range(Q):
    information = input().split()
    info_type = int(information[0])
    # print(type(information[1]), type(latest_t))
    for t in range(int(information[1]) - latest_t):
        # print(int(information[1]) - t)
        table.rotate()
        table.run()

    if info_type == 100:
        susi_pos = int(information[2]) - 1
        susi_name = information[3]
        table.append_susi(susi_pos, susi_name)
        table.run()
    elif info_type == 200:
        cus_pos = int(information[2]) - 1
        cus_name = information[3]
        cus_tar_num = int(information[4])
        customer = Customer(cus_name, cus_tar_num)
        table.append_customer(cus_pos, customer)
        table.run()
    elif info_type == 300:
        table.info()
    latest_t = int(information[1])
    # print("====")