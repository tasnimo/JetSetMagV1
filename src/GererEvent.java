/***********************************************************************
 * Module:  GererEvent.java
 * Author:  tasnim
 * Purpose: Defines the Class GererEvent
 ***********************************************************************/

import java.util.*;

/** @pdOid eba9c682-f5a7-42ed-90e3-9c58e8461d1d */
public class GererEvent {
   /** @pdRoleInfo migr=no name=Evenement assc=association47 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Evenement> evenement;
   
   /** @pdOid 434c382f-c286-472d-a4d1-2b590deb773d */
   public List<Evenement> consulterSoiree() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 88bd6267-c67e-4364-aa0a-479c592ae577 */
   public List<Evenement> consulterConcet() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 4af09f3d-05bc-415c-81e6-cc8b500de940 */
   public List<Evenement> consulterSorlie() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 83388650-017d-4454-bbab-f6cda2dcf159 */
   public List<Evenement> consulterTheatre() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 6bbdc18e-cbed-4cab-adbb-30747a4d161c */
   public int creerSoiree() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid ff5eb2df-405f-47cc-9f04-de2d0a963e8a */
   public int creerSortie() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 3e7dcad1-5f84-4067-8593-af416ef29607 */
   public int creerTheatre() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid af9ba79d-79dc-4bb5-b0bf-11fc7507c0f2 */
   public int creerConcet() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid d713775a-23ef-4ee4-99ad-3d08cc9cf398 */
   public int supprimerSoiree() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid a59f0b3b-8f07-4097-ba1e-df2f1ee9a549 */
   public int supprimerSortie() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 3d3c712e-cd2e-452d-9c10-9bd1848575c5 */
   public int supprimerTheatre() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 9f7a9035-fbcd-4204-839d-ca6560382d8f */
   public int supprimerConcet() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 8441e3a4-07ad-4155-a9cd-3abb2954b7d1 */
   public int modifierSoiree() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid b0584dd9-3fae-4676-ab02-3008812eb8e2 */
   public int modifierSortie() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 47a3614e-5657-4462-8972-560b25915da0 */
   public int modifierTheatre() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 79a42b08-e057-4e75-8c6a-16ef9219db26 */
   public int modifierConcet() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 199afc60-9537-4d3a-8ff9-64b00c3f0880 */
   public List<Evenement> consulterTousEvent() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Evenement> getEvenement() {
      if (evenement == null)
         evenement = new java.util.HashSet<Evenement>();
      return evenement;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEvenement() {
      if (evenement == null)
         evenement = new java.util.HashSet<Evenement>();
      return evenement.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEvenement */
   public void setEvenement(java.util.Collection<Evenement> newEvenement) {
      removeAllEvenement();
      for (java.util.Iterator iter = newEvenement.iterator(); iter.hasNext();)
         addEvenement((Evenement)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEvenement */
   public void addEvenement(Evenement newEvenement) {
      if (newEvenement == null)
         return;
      if (this.evenement == null)
         this.evenement = new java.util.HashSet<Evenement>();
      if (!this.evenement.contains(newEvenement))
         this.evenement.add(newEvenement);
   }
   
   /** @pdGenerated default remove
     * @param oldEvenement */
   public void removeEvenement(Evenement oldEvenement) {
      if (oldEvenement == null)
         return;
      if (this.evenement != null)
         if (this.evenement.contains(oldEvenement))
            this.evenement.remove(oldEvenement);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEvenement() {
      if (evenement != null)
         evenement.clear();
   }

}