public class DINNERforTODAY{ //日頃迷いがちな夕食の献立を提案してくれます。今回はなめこじゃないです。
	public static void main(String[]args){
		int n = 23; //好きな数
		int m = 19; //年齢
		if(n%3==0 && m<=18){
			System.out.println("きょうのばんごはんはオムライスがいいでしょう！");
		}else if(n%3==0 && m>18){
			System.out.println("きょうのばんごはんはステーキにしましょう！！");
		}else if(n%3==1 && m<20){
			System.out.println("きょうのばんごはんはハンバーグがいいんじゃないかな！");
		}else if(n%3==1 && m>=20){
			System.out.println("きょうのばんごはんにやきとりとビールはいかがでしょうか？");
		}else if(n%3==2 && m<=15){
			System.out.println("きょうのばんごはんはうどんにしましょう。");
		}else{
			System.out.println("きょうのばんごはんにみそしるをのみましょう。");
			
		}
	}
}
