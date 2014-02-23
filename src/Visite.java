/***********************************************************************
 * Module:  Visite.java
 * Author:  tasnim
 * Purpose: Defines the Class Visite
 ***********************************************************************/

import java.util.*;

/** @pdOid acfd2fe4-d77a-4532-9d73-d58ac3c5b5ff */
public class Visite {
   /** @pdOid d1e329bc-c6a4-498a-a60f-3368d4adf7fd */
   private int idVisiteur;
   /** @pdOid 27c3278b-f4c2-499e-a684-2c2a0b9ad7c3 */
   private Date dateEntree;
   /** @pdOid df5a7028-a2cd-487e-9c8f-95ce89beb7e0 */
   private String rubriqueVisitee;
   
   /** @pdRoleInfo migr=no name=Membre assc=commenter coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Membre> membre;
   
   /** @pdOid ab61ea8b-5450-4921-a56f-cbe8e456f1af */
   public int getIdVisiteur() {
      return idVisiteur;
   }
   
   /** @param newIdVisiteur
    * @pdOid aa077260-041c-4333-970c-9fd5f03c3798 */
   public void setIdVisiteur(int newIdVisiteur) {
      idVisiteur = newIdVisiteur;
   }
   
   /** @pdOid b257bf92-6d1b-4c76-9a40-6594f3b3f2b4 */
   public Date getDateEntree() {
      return dateEntree;
   }
   
   /** @param newDateEntree
    * @pdOid 048595f4-4d2e-4c08-8fa8-878b28d16be1 */
   public void setDateEntree(Date newDateEntree) {
      dateEntree = newDateEntree;
   }
   
   /** @pdOid 5a2f7f58-c5a0-46ed-ad39-2cf08ee8a406 */
   public String getRubriqueVisitee() {
      return rubriqueVisitee;
   }
   
   /** @param newRubriqueVisitee
    * @pdOid ac527d02-57aa-4b8e-902b-5d2b803325f8 */
   public void setRubriqueVisitee(String newRubriqueVisitee) {
      rubriqueVisitee = newRubriqueVisitee;
   }
   
   /** @pdOid fa6d7583-dfc1-4081-8f40-4aa7dfb5b8e4 */
   public int create() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid ef0154da-78a4-490b-87c4-0a5f349a3fbf */
   public int update() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid eab49c88-612f-4a08-802a-7c1ff08c8c9a */
   public int delete() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 3e5f248f-524c-47ed-8d07-e4f727e6bb05 */
   public static List<Visite> read() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Membre> getMembre() {
      if (membre == null)
         membre = new java.util.HashSet<Membre>();
      return membre;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMembre() {
      if (membre == null)
         membre = new java.util.HashSet<Membre>();
      return membre.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMembre */
   public void setMembre(java.util.Collection<Membre> newMembre) {
      removeAllMembre();
      for (java.util.Iterator iter = newMembre.iterator(); iter.hasNext();)
         addMembre((Membre)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMembre */
   public void addMembre(Membre newMembre) {
      if (newMembre == null)
         return;
      if (this.membre == null)
         this.membre = new java.util.HashSet<Membre>();
      if (!this.membre.contains(newMembre))
         this.membre.add(newMembre);
   }
   
   /** @pdGenerated default remove
     * @param oldMembre */
   public void removeMembre(Membre oldMembre) {
      if (oldMembre == null)
         return;
      if (this.membre != null)
         if (this.membre.contains(oldMembre))
            this.membre.remove(oldMembre);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMembre() {
      if (membre != null)
         membre.clear();
   }

}