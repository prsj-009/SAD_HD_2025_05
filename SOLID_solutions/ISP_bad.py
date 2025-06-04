class Worker:
    def work(self):
        pass

    def eat(self):
        pass

class Robot(Worker):
    def work(self):
        print("Working")
    def eat(self):
        raise Exception("Robots don't eat")
