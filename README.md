# SMART-TASK-MANAGER-API
# 📌 Smart Task Manager API

A simple REST API built using **Spring Boot (Java)** to manage daily tasks with features like creation, updating, and deletion.

---

## 🚀 Features

* ✅ Create new tasks
* ✏️ Update existing tasks
* ❌ Delete tasks
* 📋 View all tasks
* ⏰ Manage deadlines and priorities
* ⚡ Fast and simple REST API

---

## 🛠️ Tech Stack

* **Backend:** Java, Spring Boot
* **API Type:** REST API
* **Build Tool:** Maven

---

## 📂 Project Structure

src/main/java/com/taskmanager/

* controller → Handles API requests
* model → Defines Task structure
* main class → Runs the application

---

## 📡 API Endpoints

| Method | Endpoint    | Description   |
| ------ | ----------- | ------------- |
| GET    | /tasks      | Get all tasks |
| POST   | /tasks      | Create a task |
| PUT    | /tasks/{id} | Update a task |
| DELETE | /tasks/{id} | Delete a task |

---

## 📥 Sample Request (POST /tasks)

```json
{
  "id": 1,
  "title": "Complete assignment",
  "priority": "High",
  "deadline": "2026-03-30"
}
```

---

## ▶️ How to Run

1. Download or clone the repository
2. Open in IntelliJ / Eclipse
3. Run `TaskManagerApplication.java`
4. Use Postman or browser to test APIs

---

## ⚠️ Note

* This project uses in-memory storage (no database yet)
* Data will reset when the server restarts

---

## 🎯 Future Improvements

* 🔐 Add JWT Authentication
* 🗄️ Integrate MySQL Database
* 📊 Add user-based task management
* 🌐 Deploy on cloud

---

## 👩‍💻 Author

* Ami

---
