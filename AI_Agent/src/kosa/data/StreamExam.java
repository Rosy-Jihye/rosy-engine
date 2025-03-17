package kosa.data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExam {

	public static void main(String[] args) {
		//List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		List<Integer> numbers = IntStream.rangeClosed(1, 10) //��Ʈ������ �������� �����ؼ� (�׷��� ����Ʈ�� �ƴ�)
//				.filter(n -> n % 2 ==0) 
//				.map(n -> n*n)
//				.boxed() //����Ʈ�� �ڽ�
//				.collect(Collectors.toList()); 
		
		//¦���� ���͸��ϰ� ������ �� ����Ʈ�� ��ȯ => ��Ʈ��
//		List<Integer> squares = numbers.stream()
//				.filter(n -> n % 2 ==0) //�����ϸ� ����Ʈ ��ҵ��� �ϳ��� �鿩�´ٰ� �����ϸ� ��
//				.map(n -> n*n) //map : ��ҵ鿡 ���� ������ �۾��� �ؾ��� ��
//				.collect(Collectors.toList()); //����Ʈ�� ���
		
//		System.out.println(numbers);
		
		List<Student> list = Arrays.asList(
				new Student("ȫ�浿",90),
				new Student("ȫ����",70),
				new Student("��浿",50));
		
		//�����̾Ƴ���
		list.stream().mapToInt(s-> s.getScore()) //�������� �̾Ƴ��µ� student ��ü�鸶�� score�� �����´�
				.forEach(score->System.out.println(score)); //�� score���� score�� �ְ� ����Ѵ�
		
		//�̸� �̾Ƴ���(���� �̾Ƴ��� �Ͱ� �ٸ� �������)
		list.stream().map(Student::getName)
					 .forEach(name-> System.out.println(name));
		
		//��Ʈ���� �̿��ؼ� "ȫ"���� ����ϼ���. => filter
		//���� �ۼ�
		list.stream().map(Student::getName)
					.filter(name->name.matches("ȫ[��-Ş]+"))
					.forEach(name-> System.out.println(name));
		
		//������ �ۼ�
		list.stream().filter(s->s.getName().startsWith("ȫ")) //3���� s ��ü ��� ����
					 .forEach(s->System.out.println(s.getName())); //�̹� ���͸��Ǿ ȫ���� �����ϴ� s ��ü�� ����
		
		//BB,CC,AA �� �ٹٲ�
		String arr[] = {"BB", "CC", "AA"};
		//���1
		List<String> list2 = Arrays.asList(arr);
		list2.stream().sorted().forEach(System.out::println);
		//���2
		Arrays.stream(arr).sorted().forEach(System.out::println);
		
		

	}

}
