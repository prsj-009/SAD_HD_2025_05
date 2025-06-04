class User:
    def __init__(self, name):
        self.name = name

class UserRepository:
    def save(self, user):
        print(f"Saving {user.name} to the database")

class EmailService:
    def send_email(self, user, message):
        print(f"Sending email to {user.name}: {message}")
