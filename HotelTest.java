class Hotel {
	private class Room {
		int number;
		String client;

		public Room(int number, String client) {
			this.number=number;
			this.client=client;
		}
	}
	Room[] room = new Room[10]; // 객실 10개
	
	public void add(int number, String client) {
		for(int i=0;i<room.length;i++) {
			if(room[i]==null) { //배열에 아무것도 없을 때
				room[i]=new Room(number,client); //객체 생성
				break;
			}
			else
				continue; //room[i]에 값이 있으면 그냥 지나침
		}
	}

	public void show() {
		for(int i=0;i<room.length;i++) {
			if(room[i]==null)
				continue;// 출력하지않고 넘김
			else
				System.out.println(room[i].number+"번 방을 "+room[i].client+"가 예약했습니다.");
			}
		}
	}

public class HotelTest {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.add(5, "호돌이");
		hotel.add(7, "길동이");
		hotel.add(8, "초롱이");
		hotel.show();
	}
}