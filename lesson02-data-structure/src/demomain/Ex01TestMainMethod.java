package demomain;

import java.util.Random;

public class Ex01TestMainMethod {
	
	/*
	 
	 Program
	 + Data Structure: Attribute/Property
	 
	 
	 + Algorithm     : Method/Function
	 --> Tập các câu lệnh để thực thi 1 bài toán, chức năng
	 --> Nhận dữ liệu truyền vào
	 
	 --> Cú pháp của 1 hàm trong Java
	 --> [access_modifier] [static] returned_data_type method_name([...arguments])
	 
	 1. [access_modifier] phạm vi truy cập
	 Nếu 1 hàm có access modifier là
	 + private
	   --> chỉ được phép sử dụng trong class chứa nó
	 + public
	   --> sử dụng trong class hiện tại và bất kỳ nơi đâu trong dự án
	 + protected
	 + ___
	 
	 2. [static]: Học lại trong OOP - L3
	 Trong class chứa các hàm, nếu hàm có từ khóa
	 + static: hàm đó sẽ thuộc phạm vi của class
	   --> có thể lấy tên class để gọi hàm đó
	 + non   : hàm đó sẽ thuộc phạm vi của object được tạo ra từ class
	   --> tạo ra đối tượng từ class rồi mới gọi được hàm non-static
	 
	 3. returned_data_type: KDL trả về
	 + void
	 Khi code 1 hàm, kết quả của hàm đó chỉ dùng để in ra
	 Không dùng kết quả của hàm đó làm việc khác
	 --> void
	 VD: Hàm in ra chuỗi, hàm in ra tam giác
	 
	 + !void: không phải void: int, string, double
	 Khi code 1 hàm, kết quả của hàm đó lại input của 
	 1 bài toán, hàm khác phải trả về kết quả
	 VD: Logic tính toán gồm nhiều bước
	 B1 -> B2 -> B3 -> B4
	 B1: Random a --> [0, 10)
	 B2: Random b --> [0, 10)
	 B3: Sum of a and b
	 
	 4. method_name: tên hàm
	 + đặt tên theo chức năng của hàm
	 + thường là 1 [cụm] động từ
	 + quy tắc đặt tên: camel case và kí tự đầu tiên của từ đầu tiên viết thường
	   kí tự đầu tiên của các từ tiếp theo viết hoa
	   VD: getStudentId
	 
	 5. [...arguments]: tham số truyền vào
	 + Khi chương trình thực thi mỗi hàm sẽ được tạo ra
	   vào quản lý trên từng vùng nhớ khác nhau
	 + Đôi lúc dữ liệu của hàm này cần xử lý ở hàm kia --> truyền thông qua tham số
	 
	 VD: hàm main có 2 biến a, b
	 muốn tính tổng a, b thì có thể tự code logic ở hàm main
	 hoặc tạo ra hàm sum khác để xử lý, gọi hàm sum và truyền a, b vào
	  
	 
	 Trong 1 class chỉ có duy nhất 1 hàm main
	 là nơi bắt đầu và kết thức khi thực thi chương trình(Java Class)
	 
	 .java -> class -> main
	 
	 */
	
	public static void main(String[] args) {
		System.out.println("Ex01TestMainMethod#main");
		main();
		
		closure();
		Ex01TestMainMethod.closure();
		
		expose();
		Ex01TestMainMethod.expose(); 
		
		// đang chung class ko cần như này
		// chỉ lấy tên class gọi hàm hàm này được gọi từ bên ngoài class
		
		// new Ex01TestMainMethod(): tạo ra 1 đối tượng cho class Ex01TestMainMethod
		new Ex01TestMainMethod().nsTest();
		
		System.out.println("\n=======================\n");
		
		// B1
		int a = random(10);
		// B2
		int b = random(10);
		// B3
		int sum = sum(a, b);
		System.out.println("sum --> " + sum);
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private static int random(int bound) {
		return new Random().nextInt(bound);
	}
	
	// Khai báo 1 hàm main khác
	public static void main() {
		System.out.println("Ex01TestMainMethod#anotherMain");
	}
	
	private static void closure() {
		System.out.println("--> closure");
	}
	
	public static void expose() {
		System.out.println("--> expose");
	}
	
	// Ko có từ khóa static
	// Vẫn gọi được, gọi thông qua đối tượng của class
	public void nsTest() {
		System.out.println("NS-Test");
	}
	
}


