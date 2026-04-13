public class Main {
    static void main(String args[]){

        StringBuilder nameBuilder = new StringBuilder();
        for(int i=0; i< args.lenght; i++)
        {
            nameBuilder.append(args[i]);
            if(i< args.lenght-1)
            {
                nameBuilder.append(", ");
            }
            name= nameBuilder.toString();
        }

    }
}

