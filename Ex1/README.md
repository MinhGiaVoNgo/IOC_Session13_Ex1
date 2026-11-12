# SS13 - Bài 1: Hello Spring Security & Cơ chế mặc định

## Cấu trúc chính
- `Employee` (`id`, `fullName`, `salary`)
- `EmployeeController`: `GET /api/v1/employees` trả về danh sách 3 nhân viên cố định.
- Tích hợp `spring-boot-starter-security` với cấu hình mặc định.

## Chạy ứng dụng & Kiểm thử
1. Chạy `HrmApplication` (hoặc `mvn spring-boot:run`).
2. Quan sát Console Log để lấy mật khẩu UUID mặc định (dòng `Using generated security password: ...`).
3. Gọi `GET http://localhost:8080/api/v1/employees` chưa xác thực -> trả về `401 Unauthorized`.
4. Trên Postman, chọn tab **Authorization** -> **Basic Auth** -> nhập Username `user` và Password là UUID vừa copy -> nhận `200 OK` cùng danh sách 3 nhân viên.
