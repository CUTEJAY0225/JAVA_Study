import java.util.*;
// ť�� �̿��Ͽ� ���� ������ ����

class QueueDTO{
	public String operation;
	public int number;
	
	public QueueDTO(String operation, int number) {
		this.operation = operation;
		this.number = number;
	}
}

public class QueueTestEx {
	public static void main(String[] args) {
		LinkedList<QueueDTO> waitQ = new LinkedList<>();
		//Queue<QueueDTO> waitQ = new LinkedList<>();
		
		waitQ.offer(new QueueDTO("�����", 1)); // offer(): �־��� ť�� ��ü�� ����
		waitQ.offer(new QueueDTO("����", 2));
		waitQ.offer(new QueueDTO("�����", 3));
		waitQ.offer(new QueueDTO("���", 4));
		
		while(waitQ.peek() != null) { // peek(): ó���� �ִ� ��ü�� �������� �ʰ� ������ // ť�� ����ִ��� üũ
			QueueDTO queue = waitQ.poll();// ť���� ������(��ü) �ϳ� �����ϰ� �����°��� ����
			switch(queue.operation) { // ���� ������ switch�� �з�
			case "�����":
				System.out.println(queue.number+"��"+queue.operation+"â���� ������");
				break;
			case "����":
				System.out.println(queue.number+"��"+queue.operation+"â���� ������");
				break;
			default:
				System.out.println(queue.number+"��"+queue.operation+"â���� ������");
				break;
			}
		}
			
	}

}
