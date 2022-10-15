import java.util.*;
// 큐를 이용하여 은행 대기행렬 구현

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
		
		waitQ.offer(new QueueDTO("입출금", 1)); // offer(): 주어진 큐에 객체를 넣음
		waitQ.offer(new QueueDTO("대출", 2));
		waitQ.offer(new QueueDTO("입출금", 3));
		waitQ.offer(new QueueDTO("상담", 4));
		
		while(waitQ.peek() != null) { // peek(): 처음에 있는 객체를 삭제하지 않고 가져옴 // 큐가 비어있는지 체크
			QueueDTO queue = waitQ.poll();// 큐에서 데이터(객체) 하나 삭제하고 꺼내온것을 대입
			switch(queue.operation) { // 은행 업무를 switch로 분류
			case "입출금":
				System.out.println(queue.number+"번"+queue.operation+"창구로 오세요");
				break;
			case "대출":
				System.out.println(queue.number+"번"+queue.operation+"창구로 오세요");
				break;
			default:
				System.out.println(queue.number+"번"+queue.operation+"창구로 오세요");
				break;
			}
		}
			
	}

}
