class User:
    def __init__(self, name):
        self.name = name

    def save_to_db(self):
        print(f"Saving {self.name} to the database")

    def send_email(self, message):
        print(f"Sending email to {self.name}: {message}")
