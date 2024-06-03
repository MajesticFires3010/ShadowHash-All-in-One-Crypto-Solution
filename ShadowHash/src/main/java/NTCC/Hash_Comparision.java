package NTCC;

import java.util.Scanner;

public class Hash_Comparision
{
    public static void main(String[] args)
    {
        String str;
        String hash;
        String hash_gen = "";
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        str = scanner.nextLine();
        System.out.print("Enter Hash: ");
        hash = scanner.nextLine();
        System.out.print("Enter Hash Types (SHA-1: 1, MD5: 2, Others: 3): ");
        n = scanner.nextInt();

        switch (n)
        {
            case(1):
                hash_gen = Hash_SHA1.sha1Hash(str);
                break;
            case(2):
                hash_gen = Hash_MD5.md5Hash(str);
                break;
            case(3):
                System.out.println("Enter Hash Algorithm: ");
                String hash_type = scanner.next().toUpperCase();
                hash_gen = Hash_Try.tryHash(str, hash_type);
                break;
        }

        if (hash.equals(hash_gen))
        {
            System.out.println("Data is Correct");
        }
        else
        {
            System.out.println("Oops! Data has been tampered with");
        }

    }
}
