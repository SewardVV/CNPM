# CNPM
========================
BUILD OUTPUT DESCRIPTION
========================

========================
Giới thiệu về phần mềm
----------------------
    - Phần mềm cộng 2 số, trong đó 2 số nhập vào dưới dạng là chuỗi số
	- 2 file myBigNumber.java (do trang myworkspace.vn/java bị lỗi nên không thể test code được)
	- Phần mềm đã được đóng gói và dễ dàng sử dụng nó.
	- Người dùng có thể chạy file MyBigNumberTest.java để xem các testcase về phần mềm.
========================

======================================
Hướng dẫn sử dụng ứng dụng cộng hai số
--------------------------------------

1. Tải file sum.rar về máy theo đường dẫn: https://drive.google.com/open?id=16DT5sBuIjzqO53qoVsBRTMBZywh58riO
2. Quy trình cài đặt phần mềm cho khách hàng
 - B1: copy file sum.rar vào bất kì ổ đĩa nào trên máy khách hàng mà khách hàng mong muốn ở đây mình mặc định là cài ở ổ đĩa D
 - B2: Giải nén phần mềm.
 - B3: Nếu là cài ở đĩa D(và không nằm trong folder nào khác) thì hãy thêm đường dẫn D:\sum vào biến môi trường path
 - B4: Mở cmd và gõ dòng lệnh sum 2323(đây là số bất kỳ bạn muốn gõ) 23(đây cũng là số bất kỳ bạn muốn)
 - B5: Bắt đầu thử nghiệm phần mềm cộng 2 số thôi nào!
 ***
 Nếu như là muốn cài phần mềm ở ổ đĩa khác không phải là ở đĩa D hay trong folder nào đó thì hãy làm theo các bước sau đây:
 - B1: copy file sum.rar vào ổ đĩa mà khách hàng mong muốn (Ví dụ: E:/NewFile)
 - B2: Giải nén file sum.rar
 - B3: Click chuột phải vào file sum.cmd trong file sum và chọn edit và sửa lại code như sau: java -jar E:/NewFile/sum/MyBigNumber-0.0.1-SNAPSHOT.jar %1 %2
 - B4: Thêm đường dẫn E:\NewFile\sum vào biến môi trường path
 - B5: Mở cmd và gõ dòng lệnh sum 2323(đây là số bất kỳ bạn muốn gõ) 23(đây cũng là số bất kỳ bạn muốn)
 ***
3. Cách sử dụng phần mềm
 - B1: Nhập số thứ nhất vào ô bên cạnh phía bên phải dòng chữ "The First Number"
 - B2: Nhập số thứ hai vào ô bên cạnh phía bên phải dòng chữ "The Second Number"
 - B3: Nhấn nút submit để thực hiện phép toán. Kết quả sẽ in ra trong ô sát bên phải dòng chữ Result,
 và các bước hướng dẫn in ra trong ô nằm bên phải của app.
 - B4: Nhấn nút Clean để xóa dữ liệu có trong khung nhập và thực hiện lại từ đầu (bước 1) để cộng 2 số khác (nếu muốn).
4. Các lỗi thường gặp phải khi sử dụng phần mềm và phải tránh các trường hợp sau đây:
 - 2 chuỗi số nhập vào KHÔNG ĐƯỢC chứa chữ. Ví dụ: s1 = 1211A và s2 = F323232 || hay s1 = 32323 và s2 = 4hh24 || hay s1 = akjh323 và s2 = 13123
 - 2 chuỗi số nhập vào KHÔNG ĐƯỢC chứa số âm. Ví dụ: s1 = -232 và s2 = 3123 || hay s1 = 1213 và s2 =-232 || hay s1 = -212 và s2 = -323
 - 2 chuỗi nhập vào KHÔNG ĐƯỢC chứa kí tự đặc biệt. ví dụ: s1 = %234 và s2 = 42342^$% || hay s1 = 32323 và s2 = 34$ || hay s1 = $#$2 và s2 = 13123
======================================

========================================================
Hướng dẫn chạy file MyBigNumberTest.java để xem testcase
--------------------------------------------------------

1. Tải file MyBigNumber.rar theo đường dẫn: https://drive.google.com/open?id=1UcQu7TRkR3O1rFMNMnoWlK8FA0FWz35R
2. Mở eclipse lên sau đó làm các theo các bước sau:
 - B1: Giải nén file MyBigNumber.rar
 - B2: Trong giap diện của eclipse tìm trên thanh công cụ phía trên góc bên trái và Nhấn File -> Open Projects from file System ... 
 - B3: Hộp thoại sẽ mở và nhấn vào ô Directory... và chọn file MyBigNumber sau khi đã giải nén.
 - B4: Projects sẽ được build và hiển thị ra và trong thư mục src/test/java sẽ có gói myjava.mybignumber chứa file MyBigNumberTest.java.
 - B5: Nhấn chuột phải và file MyBigNumberTest.java chọn Run as -> JUnit Test.

========================================================

======================================
CONFIRM BY MY FRIEND
--------------------

















======================================

