package advance.dev;

import java.util.Arrays;
import java.util.Scanner;

class Student {
	private String name;
	private int age;
	private String address;
	private String phoneNumber;
	private double averageScore;

	// Constructor
	public Student(String name, int age, String address, String phoneNumber, double averageScore) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.averageScore = averageScore;
	}

	// Getter và Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Tuổi phải là số nguyên lớn hơn 0.");
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(double averageScore) {
		if (averageScore >= 0) {
			this.averageScore = averageScore;
		} else {
			System.out.println("Điểm trung bình phải là số thực lớn hơn hoặc bằng 0.");
		}
	}
}

public class MainApp {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Student[] students = new Student[10];

		// Nhập thông tin cho 10 sinh viên
		input(students);

		// In ra thông tin của 10 sinh viên
		print(students);

		// Sắp xếp mảng sinh viên theo thứ tự điểm trung bình tăng dần
		sort(students);

		// In ra danh sách sinh viên sau khi đã sắp xếp
		System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm trung bình tăng dần:");
		print(students);
	}

	// Phương thức nhập thông tin cho mảng sinh viên
	static void input(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");

			System.out.print("Tên: ");
			String name = scanner.nextLine();

			System.out.print("Tuổi: ");
			int age = scanner.nextInt();
			scanner.nextLine(); // Đọc bỏ kí tự '\n' trong buffer

			System.out.print("Địa chỉ: ");
			String address = scanner.nextLine();

			System.out.print("Số điện thoại: ");
			String phoneNumber = scanner.nextLine();

			System.out.print("Điểm trung bình: ");
			double averageScore = scanner.nextDouble();
			scanner.nextLine(); // Đọc bỏ kí tự '\n' trong buffer

			students[i] = new Student(name, age, address, phoneNumber, averageScore);
		}
	}

	// Phương thức in thông tin của mảng sinh viên
	static void print(Student[] students) {
		System.out.println("Danh sách sinh viên:");
		for (int i = 0; i < students.length; i++) {
			System.out.println("Sinh viên thứ " + (i + 1) + ":");
			System.out.println("Tên: " + students[i].getName());
			System.out.println("Tuổi: " + students[i].getAge());
			System.out.println("Địa chỉ: " + students[i].getAddress());
			System.out.println("Số điện thoại: " + students[i].getPhoneNumber());
			System.out.println("Điểm trung bình: " + students[i].getAverageScore());
			System.out.println();
		}
	}

	// Phương thức sắp xếp mảng sinh viên theo điểm trung bình tăng dần
	static void sort(Student[] students) {
		Arrays.sort(students, (a, b) -> Double.compare(a.getAverageScore(), b.getAverageScore()));
	}
}
