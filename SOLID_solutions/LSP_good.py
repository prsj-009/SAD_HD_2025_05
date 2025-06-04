class Bird:
    def lay_eggs(self):
        print("Lays eggs")

class FlyingBird(Bird):
    def fly(self):
        print("Flying")

class Sparrow(FlyingBird):
    pass

class Ostrich(Bird):
    pass
