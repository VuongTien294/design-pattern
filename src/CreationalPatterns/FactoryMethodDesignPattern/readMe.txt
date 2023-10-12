1.KN : Factory Pattern là một trong những Pattern phổ biến trong lập trình hướng đối tượng. Nhiệm vụ của Factory Pattern là
quản lý và trả về các đối tượng theo yêu cầu, giúp cho việc khởi tạo đổi tượng một cách linh hoạt hơn.

2.Cách dùng :
- Ta cần mua 1 cái máy tính và nếu muốn mua máy Window ta phải đến cửa hàng Window, và muốn mua Linux thì ta phải đến cửa hàng
Linux.Nếu muốn trải nghiệm từng sản phản ta phả qua 2 cửa hàng gây mất thời gian

=> Cách giải quyết : Ta chỉ cần đến 1 cửa hàng bán cả 2 loại máy

3.Áp dụng
- Khi 1 đối tượng với từng version thì nó có các hàm phải xử lí khác nhau
- Với VD trên thì ta có với class OperatingSystem thì với version Window thì xử lí 1 kiểu và với version Linux ta sẽ xử lí kiểu khác

=> Áp dụng Factory Pattern