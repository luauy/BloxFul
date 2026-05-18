# 🛠️ Mobile Studio Engine (Roblox Evolution Project)

![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/luauy/BloxFul/main.yml?branch=main&style=plastic&logo=github&label=Build%20Status)
![GitHub Repo stars](https://img.shields.io/github/stars/luauy/BloxFul?style=plastic&logo=github&color=yellow)
![GitHub contributors](https://img.shields.io/github/contributors/luauy/BloxFul?style=plastic&color=blue)
![Platform](https://img.shields.io/badge/Platform-Android-green?style=plastic&logo=android)
![Language](https://img.shields.io/badge/Engine-Luau%20%7C%20Android%20XML%20UI%20%7C%20Java-blue?style=plastic)
![Environment](https://img.shields.io/badge/Environment-Mobile%20Studio-orange?style=plastic)

---

## 📌 Project Overview

An ambitious, next-generation platform designed to bring a high-performance creation engine and fully functional studio environment directly to mobile devices. Users can build, script using optimized multi-threaded runtimes, design complex graphical interfaces, and deploy their games natively from a smartphone or tablet. 

This repository leverages an automated continuous integration and continuous deployment (CI/CD) pipeline. Every codebase update automatically triggers cloud compilation, optimization checks, and packaging to deliver immediate test builds.

---

## 🚀 Strategic Goals

* **On-Device Development:** Break the desktop barrier by providing a fully interactive, mobile-optimized studio interface for asset manipulation and environmental building.
* **High-Performance Luau Runtime:** Integrate a highly secure, optimized scripting VM designed to handle complex game logic and UI state machines efficiently on mobile hardware.
* **Rapid Iteration Loop:** Utilize automated backend infrastructure to compile, sign, and distribute development binaries instantly to testers and developers.
* **Advanced Security & Obfuscation:** Protect core engine systems and user-generated scripts with custom bytecode protection layers and variable hex-scoping techniques.

---

## ⚙️ Automated Pipeline Features

Our automated pipeline eliminates local compilation bottlenecks by shifting the heavy lifting to cloud environments:

* **Automated Package Assembly:** Every push to the main branch triggers automated Android SDK provisioning to compile the engine binaries.
* **Intelligent Dependency Caching:** Build environments cache framework dependencies and native build tools to keep iteration times as fast as possible.
* **Secure Key Management:** Production release keys and keystore credentials are fully isolated within encrypted repository layers, ensuring public code visibility never compromises security.
* **Instant Artifact Distribution:** Compiled binaries are packed and exposed securely on the workflow execution dashboard for immediate hardware testing.

---

## 👥 Visitors & Contributors

Welcome to the development hub of the Mobile Studio Engine project! Whether you are a core developer, an open-source contributor, or a tester looking to try out the latest builds, this section guides you on how to interact with our ecosystem.

### 📥 Getting the Latest Build

If you are visiting this repository to download and test the current development version of the application, follow these steps:

1. Navigate to the **Actions** tab at the top of the repository interface.
2. Select the most recent successful workflow run from the history list (indicated by a green checkmark).
3. Scroll down to the **Artifacts** section at the bottom of the summary page.
4. Click the compiled artifact link to download the zip file containing the ready-to-install Android APK.

### 🛠️ Contribution Guidelines

We welcome contributions to the engine architecture, native runtime optimizations, and UI layouts. Please adhere to the following workflow when contributing:

* **Branching Strategy:** Create a descriptive feature branch from `main` (e.g., `feature/luau-vm-optimization` or `bugfix/studio-ui-scaling`) before writing code.
* **Code Quality & Safety:** Ensure your scripts and native components do not hardcode credentials or break existing structural rules. All codebase entries must build successfully without local warnings.
* **Testing CI Status:** Before submitting a Pull Request, verify that your local changes do not break the compiler. Every open Pull Request automatically triggers the CI pipeline to protect build stability.
* **Pull Requests:** Open a Pull Request against the `main` branch. Provide a clear summary of your modifications, reference any relevant issue tracking, and ensure the automated build checks pass.

### 💬 Community & Feedback

If you encounter bugs during testing or have feature proposals for the mobile studio environment, please use the **Issues** tab to log them. Clearly specify your hardware configuration, steps to reproduce the issue, and include any relevant execution logs.
