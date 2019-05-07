class Hotel {
	private class Room {
		int number;
		String client;

		public Room(int number, String client) {
			this.number=number;
			this.client=client;
		}
	}
	Room[] room = new Room[10]; // ���� 10��
	
	public void add(int number, String client) {
		for(int i=0;i<room.length;i++) {
			if(room[i]==null) { //�迭�� �ƹ��͵� ���� ��
				room[i]=new Room(number,client); //��ü ����
				break;
			}
			else
				continue; //room[i]�� ���� ������ �׳� ����ħ
		}
	}

	public void show() {
		for(int i=0;i<room.length;i++) {
			if(room[i]==null)
				continue;// ��������ʰ� �ѱ�
			else
				System.out.println(room[i].number+"�� ���� "+room[i].client+"�� �����߽��ϴ�.");
			}
		}
	}

public class HotelTest {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.add(5, "ȣ����");
		hotel.add(7, "�浿��");
		hotel.add(8, "�ʷ���");
		hotel.show();
	}
}