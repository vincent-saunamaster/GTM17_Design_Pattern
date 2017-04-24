package presentation;

import metier.Document;
import metier.DocumentHtml;
import metier.DocumentPdf;

public class ServeurWeb
{

  public static void main(String[] args)
  {
    Document document1, document2;
    document1 = new DocumentHtml();
    document1.setContenu("Hello");
    document1.dessine();
    System.out.println();
    document2 = new DocumentPdf();
    document2.setContenu("Bonjour");
    document2.dessine();
  }
}
