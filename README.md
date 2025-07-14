📚 Bookstore Android Application

🚀 Overview
Welcome to the Bookstore Android Application, a project developed for the Mobile Device Programming course at Vietnam Aviation Academy. This app provides a seamless and user-friendly platform for buying and selling books, built with Java and SQLite using the MVC (Model-View-Controller) architecture. It caters to users looking for a simple, offline-capable solution to browse, search, and purchase books.

✨ Key Features
🛒 User Features

🔐 Registration & Login: Create an account or log in to access personalized features.
📖 Browse Books: Explore books by category or view highlighted bestsellers, new releases, or discounted titles.
🔍 Search: Find books quickly using keyword-based search.
🛍️ Shopping Cart: Add books, update quantities, and review items before checkout.
📦 Order Placement: Place orders with customer details and track order history.
👤 User Profile: Manage personal information and view past orders.
⭐ Reviews: Rate and comment on purchased books to share feedback.

🛠️ Admin Features

📚 Product Management: Add, edit, or remove books and categories.
📋 Order Management: View, confirm, and update order statuses.
💸 Revenue Tracking: Monitor sales performance with daily, monthly, or yearly reports.
💬 Customer Interaction: Respond to user comments and messages for support.


🛠️ Technologies Used

Programming Language: Java ☕
Platform: Android 📱
IDE: Android Studio 🖥️
Database: SQLite 🗄️ (local storage for users, books, cart, and orders)
UI Design: XML with ConstraintLayout for responsive layouts 🎨
Components: RecyclerView for efficient list rendering, Fragments for reusable UI
Architecture: MVC (Model-View-Controller) 🏗️


🗄️ Database Schema
The app uses SQLite to manage the following tables:



Table
Purpose
Key Attributes



USER
Stores user info
Id, Username, Email, Password, Role (0=user, 1=admin)


messages
Manages user-admin communication
id, content, isFromUser, timestamp, adminResponse


Loai_SP
Stores book categories
MaLoai, TenLoai


SanPham
Manages book details
MaSP, MaLoai, TenSP, GiaNhap, GiaBan, SoLuong, MoTa, HinhAnh


GioHang
Stores cart items
id, MaSP, tenSanPham, gia, soLuong, hinhAnh


ThanhToan
Records orders
id, tenNguoi, sdt, diaChi, tongTien, trangThai, MaSP, TenSP


Comment
Stores book reviews
id, MaSP, tenNguoiDung, ngayDanhGia, sao, noiDung, ThanhToanid


Relationships:

SanPham links to Loai_SP via MaLoai.
GioHang, ThanhToan, and Comment link to SanPham via MaSP.
Comment links to ThanhToan to verify reviews from buyers.


📂 Project Structure

Model: Defines data structures and DAO classes for database operations (e.g., sanPhamDao.java, cartDao.java).
View: Includes Activities and Fragments for UI (e.g., TrangchuFragment.java, NoibatFragment.java).
Controller: Manages interactions and navigation (e.g., MainActivity.java for Fragment navigation).
Database: Handled by DatabaseHelper.java for SQLite management.


📥 Installation & Setup

Prerequisites:

Android Studio (latest version)
Java Development Kit (JDK)
Android SDK (API 21 or higher)


Steps:
git clone https://github.com/MinDuck404/Sach.git


Open the project in Android Studio.
Sync with Gradle to resolve dependencies.
Run on an emulator or Android device.




🎮 Usage
User Flow

Register or log in to access the app.
Browse or search for books.
Add items to the cart and proceed to checkout.
View order history and submit reviews for purchased books.

Admin Flow

Log in with admin credentials.
Manage books, categories, orders, and revenue.
Respond to user messages and reviews.


🚀 Future Improvements

🌐 Cloud Sync: Integrate Firebase or Room for real-time data synchronization.
💳 Online Payments: Add payment gateways like MoMo or ZaloPay.
🎨 Enhanced UI/UX: Introduce animations, advanced search, and personalized recommendations.
📸 Rich Reviews: Allow users to attach images to reviews.
🔗 API Integration: Develop a server-side API for centralized data and multi-user support.
🔐 Role-Based Access: Enhance admin and staff role distinctions.


👥 Contributors

Đặng Trần Minh Đức (Group Leader) - MSSV: 2254810221
Lê Huỳnh Hồng Nguyên - MSSV: 2254810227
Văn Hồng Quân - MSSV: 2254810255
Đỗ Danh Toại - MSSV: 2254810251
Nguyễn Hoàng Việt - MSSV: 2331540177


📚 References

CrazyStevenz/bookstore - GitHub Repository
Best SQLite Books - BookAuthority
Save data using SQLite - Android Developers
Android SQLite Tutorial - Vogella
Android Studio SQLite Tutorial - CodeWith
