# 💳 ATM Machine Simulation in Java

This is a simple **ATM Machine simulation** program built using Java. The application allows users to interact with a virtual ATM by verifying their PIN and performing banking operations like checking balance, depositing, and withdrawing money.

## 📂 Package: `ATMMachine`

---

## 🚀 Features

- 🔒 PIN-based user authentication (maximum 3 attempts)
- 💰 Check account balance
- 💸 Deposit money into account
- 🏧 Withdraw money with balance check
- 🚪 Exit the program gracefully

---

## 🧾 Code Structure

### `ATM` Class
- **Variables**:
  - `float Balance` – Stores account balance
  - `int PIN = 5674` – Predefined PIN
- **Methods**:
  - `checkpin()` – Prompts user for PIN (max 3 tries)
  - `menu()` – Displays options
  - `checkBalance()` – Shows balance
  - `withdraw()` – Withdraws money if balance allows
  - `deposit()` – Adds money to account

### `ATMMachine` Class
- Entry point of the program
- Calls `checkpin()` to start the ATM menu

---

## 🛠️ How to Run

1. **Clone or download** this repository.
2. Open a terminal and navigate to the project folder.
3. Compile the program:

   ```bash
   javac ATMMachine.java
