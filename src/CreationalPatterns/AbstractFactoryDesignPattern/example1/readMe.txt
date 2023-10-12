1.Bối cảnh
- Giả sử chúng ta có một nhà máy sản xuất thời trang với nhiều phân xưởng. Cái thì phụ trách sản xuất jean, cái sản xuất váy,
cái thì sản xuất TShirt,..Yêu cầu đặt ra là chúng ta cần tạo ra nhà máy sao cho nó đáp ứng được hầu hết các thay đổi thị hiếu
người dùng và thị trường, như mùa hè thì sản xuất mẫu A, mùa đông lại sản xuất mẫu B cho từng dòng sản phẩm jean, váy,
TShirt...Với điều kiện là không phải đầu tư thêm máy móc và nhân công hay sắp xếp lại bộ máy nhân sự vì rất tốn kém
và mất nhiều thời gian

2.KN
- Nó là phương pháp tạo ra một Super-factory dùng để tạo ra các Factory khác. Hay còn được gọi là Factory của các Factory.
Abstract Factory Pattern là một Pattern cấp cao hơn so với Factory Method Pattern.
Trong Abstract Factory pattern, một interface có nhiệm vụ tạo ra một Factory của các object có liên quan tới nhau mà không
cần phải chỉ ra trực tiếp các class của object. Mỗi Factory được tạo ra có thể tạo ra các object bằng phương pháp giống
như Factory pattern.

3.Cách cài đặt
* AbstractFactory : khai báo dạng interface hoặc abstract class chứa các phương thức để tạo ra các đối tượng abstract (abstarct)
- MainFactory
* ConcreteFactory : Xây dựng, cài đặt các phương thức tạo các đối tượng cụ thể (class)
- SummerFactory, WinterFactory
* AbstractProduct : Khai báo dạng interface hoặc abstract class để định nghĩa đối tượng abstract (abstract)
- Dress, Jean, TShirt
* Product : Cài đặt của các đối tượng cụ thể, cài đặt các phương thức được quy định tại AbstractProduct (class)
- SummerDress, WinterDress, SummerJean, WinterJean, SummerTShirt, WinterTShirt
* Client : là đối tượng sử dụng AbstractFactory và các AbstractProduct
- Application