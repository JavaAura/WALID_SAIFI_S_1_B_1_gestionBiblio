package gestion;
import java.util.*;
public class Bibliotheque {

    private List<document> documents;

    private Map<String, document> documentMap = new HashMap<>();

    public Bibliotheque(){

        this.documents = new ArrayList();
        
    }

 
    public void ajouterDocument(document doc) {
        this.documents.add(doc);
        
        this.documentMap.put(String.valueOf(doc.id), doc);
    }
    public void emprunterDocument(int id) {
      
        String strId = String.valueOf(id);
    
        document document = documentMap.get(strId);
         System.out.println(document);     
            if (document != null) {
            document.emprunter();
        } else {
            System.out.println("Document non trouvé.");
        }
    }
    
    public void retournerDocument(int  id){
        String str = String.valueOf(id);
        
        document Document = documentMap.get(str);
        if(Document != null){
            Document.retourner();
        }else{
            System.out.println("Document non trouvé.");
        }
    }

    public void afficherDocuments() {
        for (document Document : documents) {
             Document.afficherDetails();  
        }
    }

    public void rechercherDocument(int id) {
       
        String strId = String.valueOf(id);
        document document = documentMap.get(strId);
 
        if (document != null) {
            System.out.println("Le document recherché est : ");
            document.afficherDetails();
        } else {
            System.out.println("Le document n'est pas trouvé.");
        }
    }
    

}
