/***********************************************************************
 * Module:  GererCommentaire.java
 * Author:  tasnim
 * Purpose: Defines the Class GererCommentaire
 ***********************************************************************/

import java.util.*;

/** @pdOid 6b08b2bc-0d78-4f69-bbdb-1eefeb7539c1 */
public class GererCommentaire {
   /** @pdRoleInfo migr=no name=Commentaire assc=association46 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Commentaire> commentaire;
   
   /** @pdOid 4d9affeb-ae11-4912-aea7-3ce259c2d642 */
   public List<Commentaire> consulterCom() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid ee03da07-b339-45be-ac00-904aed0c1b95 */
   public void supprimerCom() {
      // TODO: implement
   }
   
   /** @pdOid db0cfb7c-d7c9-4d0c-95c7-e26d304844df */
   public List<Commentaire> rechercherParText() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid c460d897-29a6-4e35-a2f0-c76ef87815c6 */
   public List<Commentaire> rechercherParClient() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 096d05f9-ed91-4154-885f-4eb8189e8973 */
   public List<Commentaire> rechercherParDate() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 46059178-e4fc-4c81-acbb-a971b97c41dd */
   public List<Commentaire> rechercherParEvent() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Commentaire> getCommentaire() {
      if (commentaire == null)
         commentaire = new java.util.HashSet<Commentaire>();
      return commentaire;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCommentaire() {
      if (commentaire == null)
         commentaire = new java.util.HashSet<Commentaire>();
      return commentaire.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCommentaire */
   public void setCommentaire(java.util.Collection<Commentaire> newCommentaire) {
      removeAllCommentaire();
      for (java.util.Iterator iter = newCommentaire.iterator(); iter.hasNext();)
         addCommentaire((Commentaire)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCommentaire */
   public void addCommentaire(Commentaire newCommentaire) {
      if (newCommentaire == null)
         return;
      if (this.commentaire == null)
         this.commentaire = new java.util.HashSet<Commentaire>();
      if (!this.commentaire.contains(newCommentaire))
         this.commentaire.add(newCommentaire);
   }
   
   /** @pdGenerated default remove
     * @param oldCommentaire */
   public void removeCommentaire(Commentaire oldCommentaire) {
      if (oldCommentaire == null)
         return;
      if (this.commentaire != null)
         if (this.commentaire.contains(oldCommentaire))
            this.commentaire.remove(oldCommentaire);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCommentaire() {
      if (commentaire != null)
         commentaire.clear();
   }

}