package kosa.data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExam {

	public static void main(String[] args) {
		//List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		List<Integer> numbers = IntStream.rangeClosed(1, 10) //스트림으로 레인지를 생성해서 (그러면 리스트가 아님)
//				.filter(n -> n % 2 ==0) 
//				.map(n -> n*n)
//				.boxed() //리스트로 박싱
//				.collect(Collectors.toList()); 
		
		//짝수만 필터링하고 제곱한 후 리스트로 변환 => 스트림
//		List<Integer> squares = numbers.stream()
//				.filter(n -> n % 2 ==0) //필터하면 리스트 요소들이 하나씩 들여온다고 생각하면 됨
//				.map(n -> n*n) //map : 요소들에 대해 각각의 작업을 해야할 때
//				.collect(Collectors.toList()); //리스트로 출력
		
//		System.out.println(numbers);
		
		List<Student> list = Arrays.asList(
				new Student("홍길동",90),
				new Student("홍동길",70),
				new Student("김길동",50));
		
		//점수뽑아내기
		list.stream().mapToInt(s-> s.getScore()) //정수값을 뽑아내는데 student 객체들마다 score를 가져온다
				.forEach(score->System.out.println(score)); //각 score값을 score에 넣고 출력한다
		
		//이름 뽑아내기(점수 뽑아내는 것과 다른 방법으로)
		list.stream().map(Student::getName)
					 .forEach(name-> System.out.println(name));
		
		//스트림을 이용해서 "홍"씨만 출력하세요. => filter
		//내가 작성
		list.stream().map(Student::getName)
					.filter(name->name.matches("홍[가-힇]+"))
					.forEach(name-> System.out.println(name));
		
		//교수님 작성
		list.stream().filter(s->s.getName().startsWith("홍")) //3개의 s 객체 모두 들어옴
					 .forEach(s->System.out.println(s.getName())); //이미 필터링되어서 홍으로 시작하는 s 객체만 들어옴
		
		//BB,CC,AA 각 줄바꿈
		String arr[] = {"BB", "CC", "AA"};
		//방법1
		List<String> list2 = Arrays.asList(arr);
		list2.stream().sorted().forEach(System.out::println);
		//방법2
		Arrays.stream(arr).sorted().forEach(System.out::println);
		
		

	}

}
