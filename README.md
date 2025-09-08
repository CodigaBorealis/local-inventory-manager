# 🗂️ Local Inventory Manager

**A local inventory manager that stores data in a JSON file. No database required.**

---

## 📦 Features

- Add, edit, and delete inventory items.  
- Track stock, categories, suppliers, and prices.  
- Lightweight UI built with Java Swing.  
- Data stored locally in a `JSON` file.  
- No internet connection or database setup required.  

---

## 🚀 Getting Started

### Requirements
- Java 12 or higher.

### Run Instructions
1. Clone or download this repository.
2. Open it in your Java IDE.
3. Compile and run the `localInventoryManager.java` class.

> 📁 On first run, a file will be created at:
>
> ```
> storage/inventory.json
> ```
>
> All inventory data will be saved there between sessions.

---

## 📌 Notes

- If `inventory.json` doesn't exist, it is created automatically.
- All data is kept **local** — it will not be accessible from other devices.
- A JAR file containing **Gson** by Google is bundled with this project.  
  I claim **no ownership** over this library.

---

## 📚 Dependencies

This project uses [**Gson**](https://github.com/google/gson), a JSON parsing library developed by **Google**, for serialization and deserialization of inventory data.

---

## 📄 License

This project is free to use and modify.  
No warranty or liability is implied.

---
