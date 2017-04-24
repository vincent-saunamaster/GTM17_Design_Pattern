package metier;
public class ComposantGestionDocument implements
  GestionDocument
{

  public String document(int index)
  {
    return "Document num�ro " + index;
  }
}
