# 🚨 CrisisConnect
### **Real-Time Disaster Management & Response System**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white) ![Leaflet](https://img.shields.io/badge/Leaflet-199900?style=for-the-badge&logo=Leaflet&logoColor=white) ![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)

> **"Uber for Ambulances"** – A full-stack solution bridging the gap between distress signals and emergency responders through live GPS tracking and instant data visualization.

---

## 📖 **Overview**
In critical situations like floods, fires, or medical emergencies, explaining a location over a phone call takes valuable time. **CrisisConnect** solves this by allowing users to send an instant **SOS Beacon** with precise GPS coordinates.

This project features a **Live Command Center** dashboard that visualizes incidents on an interactive map, categorizing them by severity (Critical, Moderate, Low) to help authorities prioritize rescue operations efficiently.

---

## ⚙️ **Tech Stack**

| Component | Technology | Description |
| :--- | :--- | :--- |
| **Backend** | **Java (Spring Boot)** | Handles REST APIs, business logic, and server management. |
| **Frontend** | **HTML5, CSS3, JS** | A modern "Dark Mode" UI with glassmorphism effects. |
| **Mapping** | **Leaflet.js** | Renders the interactive map and handles Geolocation markers. |
| **Database** | **H2 Database** | In-memory SQL database for storing incident reports. |
| **Build Tool** | **Maven** | Dependency management and project build automation. |

---

## ✨ **Key Features**

* **📍 Live GPS Tracking:** Uses the browser's Geolocation API to instantly lock onto the user's position.
* **🚨 Priority Classification:**
    * 🔴 **CRITICAL:** High-priority life threats (Pulsing Red Marker).
    * 🟠 **MODERATE:** Property damage/Injury (Orange Marker).
    * 🟢 **LOW:** Information/Advisory (Green Marker).
* **🗺️ Interactive Tactical Map:** A "Dark Mode" map optimized for high-contrast visibility in control rooms.
* **⚡ Zero-Latency Reporting:** Instant data transmission from victim to the command center using RESTful APIs.
* **📱 Responsive Design:** Works seamlessly on desktops and mobile devices.

---

## 📂 **Project Structure**

```bash
CrisisConnect/
├── src/
│   ├── main/
│   │   ├── java/com/hackathon/crisisconnect/
│   │   │   ├── controller/       # REST Controllers (API Endpoints)
│   │   │   │   └── CrisisController.java
│   │   │   ├── model/            # Database Entities (Data Structure)
│   │   │   │   └── CrisisRequest.java
│   │   │   ├── repository/       # JPA Repositories (Database Access)
│   │   │   │   └── CrisisRepository.java
│   │   │   └── CrisisConnectApplication.java  # Main Entry Point
│   │   └── resources/
│   │       ├── static/           # Frontend Files
│   │       │   └── index.html    # The Dashboard UI
│   │       └── application.properties # H2 Config & Server Port
├── mvnw & mvnw.cmd               # Maven Wrapper Scripts
├── pom.xml                       # Project Dependencies
└── README.md                     # Documentation
```
---

## 🚀 **How to Run Locally**

1.  **Clone the Repository**
    ```bash
    git clone [https://github.com/ishxy22/CrisisConnect.git]
    cd CrisisConnect
    ```

2.  **Run the Application**
    You can run it using the Maven wrapper included in the project:
    ```bash
    ./mvnw spring-boot:run
    ```

3.  **Access the Dashboard**
    Open your browser and navigate to:
    👉 **`http://localhost:8080/index.html`**

---

## 🔌 **API Endpoints**

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/api/crisis/submit` | Receives new SOS alerts with location data. |
| `GET` | `/api/crisis/all` | Fetches the list of all active incidents for the map. |

---

## 🔮 **Future Scope**
* **SMS Integration:** Automatically notify family members when an alert is sent.
* **AI Severity Analysis:** Use NLP to predict the severity based on the description text.
* **Route Optimization:** Show the shortest path for rescue teams to reach the red dot.

---
