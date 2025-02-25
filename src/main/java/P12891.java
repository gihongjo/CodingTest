    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    public class P12891 {
        public static void main(String[] args) throws IOException {

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer stringTokenizer=new StringTokenizer(br.readLine());

            int DnaLen=Integer.parseInt(stringTokenizer.nextToken());
            int pwLen=Integer.parseInt(stringTokenizer.nextToken());

            stringTokenizer=new StringTokenizer(br.readLine());

            char[] dna=stringTokenizer.nextToken().toCharArray();

            stringTokenizer=new StringTokenizer(br.readLine());

            int A=Integer.parseInt(stringTokenizer.nextToken());
            int C = Integer.parseInt(stringTokenizer.nextToken());
            int G= Integer.parseInt(stringTokenizer.nextToken());
            int T =Integer.parseInt(stringTokenizer.nextToken());
            int[] dnaCorrect={A, C, G, T};
            int[] dnaCount={0,0,0,0};



            int start=0;
            int end = pwLen-1;

            int result=0;

            //최초 슬라이딩 윈도우 생성

            for(int i=0;i<pwLen;i++){
                switch(dna[i]){
                    case 'A':
                        dnaCount[0]++;
                        break;
                    case 'C':
                        dnaCount[1]++;
                        break;
                    case 'G':
                        dnaCount[2]++;
                        break;
                    case 'T':
                        dnaCount[3]++;
                        break;
                }
            }

            boolean firstCheack=true;

            for(int a=0;a<4;a++){
                if(dnaCorrect[a]>dnaCount[a]){
                    firstCheack=false;
                }
            }

            if(firstCheack==true){
                result++;
            }

            //최초 윈도우 검수 끝


            while(end<DnaLen-1){

                boolean check=true;

                switch(dna[start]){
                    case 'A':
                        dnaCount[0]--;
                        break;
                    case 'C':
                        dnaCount[1]--;
                        break;
                    case 'G':
                        dnaCount[2]--;
                        break;
                    case 'T':
                        dnaCount[3]--;
                        break;
                }

                switch(dna[end+1]){
                    case 'A':
                        dnaCount[0]++;
                        break;
                    case 'C':
                        dnaCount[1]++;
                        break;
                    case 'G':
                        dnaCount[2]++;
                        break;
                    case 'T':
                        dnaCount[3]++;
                        break;
                }

                for(int a=0;a<4;a++){
                    if(dnaCorrect[a]>dnaCount[a]){
                        check=false;
                    }
                }

                if(check==true){
                    result++;
                }

                start++;
                end++;


            }

            System.out.println(result);




        }
    }
