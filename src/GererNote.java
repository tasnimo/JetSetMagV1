/***********************************************************************
 * Module:  GererNote.java
 * Author:  tasnim
 * Purpose: Defines the Class GererNote
 ***********************************************************************/

import java.util.*;

/** @pdOid 17ab1784-0ca0-4abf-882e-24cdd6c9d268 */
public class GererNote {
   /** @pdRoleInfo migr=no name=InterfaceGestionNote assc=association58 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceGestionNote> interfaceGestionNote;
   
   /** @pdOid bd974cc9-0838-4fe8-acfa-4e1ba9be0e05 */
   public int consulterNbEtoile() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid bd2f98fc-7118-4e27-8d3c-a661404e8c02 */
   public int rechercherEvent() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid a3787e30-b672-4bef-8baa-ddd5eb728041 */
   public int rechercherParArticle() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid bffe3790-f4bf-4751-8f29-591064a1c74a */
   public int rechercherParDate() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 7326831a-3f3f-4b1d-b90c-7b59f9d708d9 */
   public int calculerMoyenneNote() {
      // TODO: implement
      return 0;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceGestionNote> getInterfaceGestionNote() {
      if (interfaceGestionNote == null)
         interfaceGestionNote = new java.util.HashSet<InterfaceGestionNote>();
      return interfaceGestionNote;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceGestionNote() {
      if (interfaceGestionNote == null)
         interfaceGestionNote = new java.util.HashSet<InterfaceGestionNote>();
      return interfaceGestionNote.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceGestionNote */
   public void setInterfaceGestionNote(java.util.Collection<InterfaceGestionNote> newInterfaceGestionNote) {
      removeAllInterfaceGestionNote();
      for (java.util.Iterator iter = newInterfaceGestionNote.iterator(); iter.hasNext();)
         addInterfaceGestionNote((InterfaceGestionNote)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceGestionNote */
   public void addInterfaceGestionNote(InterfaceGestionNote newInterfaceGestionNote) {
      if (newInterfaceGestionNote == null)
         return;
      if (this.interfaceGestionNote == null)
         this.interfaceGestionNote = new java.util.HashSet<InterfaceGestionNote>();
      if (!this.interfaceGestionNote.contains(newInterfaceGestionNote))
         this.interfaceGestionNote.add(newInterfaceGestionNote);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceGestionNote */
   public void removeInterfaceGestionNote(InterfaceGestionNote oldInterfaceGestionNote) {
      if (oldInterfaceGestionNote == null)
         return;
      if (this.interfaceGestionNote != null)
         if (this.interfaceGestionNote.contains(oldInterfaceGestionNote))
            this.interfaceGestionNote.remove(oldInterfaceGestionNote);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceGestionNote() {
      if (interfaceGestionNote != null)
         interfaceGestionNote.clear();
   }

}