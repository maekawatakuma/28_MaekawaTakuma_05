import java.util.Random;
public class kadai {
    public static void main(String[] args){

        System.out.println("下記の質問に答えてみよう!!");

        System.out.println("解答例: 1:その通り！, 2:まあその通りかな, 3:そんなに当てはまらない, 4:そんなことないかな.");
        System.out.println();

        String text[] = new String[5];

        text[0]="問1:休みの日は出かけることが多い";
        text[1]= "問2:旅行にいくなら行ったことのないところに行きたい";
        text[2]= "問3:決断する時はよく考えるより直感で決めるほうだ";
        text[3]= "問4:体を動かすのが好きだ";
        text[4]= "問5:同じ場所にじっとしてるのが苦手だ";

        System.out.println(text[0]);
        int ans = new java. util.Scanner(System.in).nextInt();
        System.out.println(text[1]);
        int ans1 = new java. util.Scanner(System.in).nextInt();
        System.out.println(text[2]);
        int ans2 = new java. util.Scanner(System.in).nextInt();
        System.out.println(text[3]);
        int ans3 = new java. util.Scanner(System.in).nextInt();
        System.out.println(text[4]);
        int ans4 = new java. util.Scanner(System.in).nextInt();

        int sum = ans + ans1 + ans2 + ans3 + ans4;
        System.out.println("");
        System.out.println("診断結果");

        if(sum <= 7){
            System.out.println( "あなたはじっとしてられないタイプの人です、考えるより先に行動派ですね");
        }else if(sum <= 9) {
            System.out.println("あなたは自分を持ってる人かつ他人の意見も素直に聞ける人です。");
        }else if(sum <= 13){
            System.out.println("あなたは落ち着いて行動できる人です。周りを見れる力もあります");
        }else if(sum <= 20) {
            System.out.println("あなたはじっくり考えて行動する人です。慎重な判断が得意です");
        }
    }
}
