/***********************************************************************
 * Module:  Media.java
 * Author:  tasnim
 * Purpose: Defines the Class Media
 ***********************************************************************/

import java.util.*;

/** @pdOid 6f7719ef-3607-44f5-8f17-0ba79ebc4404 */
public class Media {
   /** @pdOid 860590d6-9b55-4abc-8ac2-098d7ac5040b */
   private int idMedia;
   /** @pdOid 7f0a9f38-cc78-4722-ae09-7e214e44f715 */
   private String typeMedia;
   /** @pdOid b9a60171-2722-4df1-9378-2a66fe3bafae */
   private String url;
   
   /** @pdRoleInfo migr=no name=Article assc=comporter coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Article> article;
   /** @pdRoleInfo migr=no name=Evenement assc=association50 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Evenement> evenement;
   /** @pdRoleInfo migr=no name=Film assc=comporter mult=0..* side=A */
   public Film[] film;
   
   /** @pdOid f04a24ea-4215-47e7-9044-d0121d49a906 */
   public String getUrl() {
      return url;
   }
   
   /** @param newUrl
    * @pdOid e56aff10-d3e6-4fef-a9b2-5452f58337ac */
   public void setUrl(String newUrl) {
      url = newUrl;
   }
   
   /** @pdOid 08e08481-5d4f-4da4-991f-9ccf44beb1fd */
   public Media() {
      // TODO: implement
   }
   
   /** @pdOid b3965ccc-1011-4d25-a2c5-25842e1e28e1 */
   public int getIdMedia() {
      return idMedia;
   }
   
   /** @param newIdMedia
    * @pdOid 272e4b3b-4fcb-4d70-b81f-a9bfa33ef177 */
   public void setIdMedia(int newIdMedia) {
      idMedia = newIdMedia;
   }
   
   /** @pdOid 1321e1fc-2dc0-4553-8026-423a92a8ff98 */
   public String getTypeMedia() {
      return typeMedia;
   }
   
   /** @param newTypeMedia
    * @pdOid 4fb2d857-f150-4712-b07a-cf8118c569b0 */
   public void setTypeMedia(String newTypeMedia) {
      typeMedia = newTypeMedia;
   }
   
   /** @pdOid 7c04715c-98f1-429d-ab37-cc4b5af0bfa6 */
   public int update() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 3cf2eba7-8e26-4401-9e1f-c8ee041b8ce0 */
   public int create() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 5cf0e962-2141-4bd9-89b4-7b83e519f42b */
   public List<Media> read() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid bda03ed3-2cb4-4b28-a258-310a2657108e */
   public int delete() {
      // TODO: implement
      return 0;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Article> getArticle() {
      if (article == null)
         article = new java.util.HashSet<Article>();
      return article;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorArticle() {
      if (article == null)
         article = new java.util.HashSet<Article>();
      return article.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newArticle */
   public void setArticle(java.util.Collection<Article> newArticle) {
      removeAllArticle();
      for (java.util.Iterator iter = newArticle.iterator(); iter.hasNext();)
         addArticle((Article)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newArticle */
   public void addArticle(Article newArticle) {
      if (newArticle == null)
         return;
      if (this.article == null)
         this.article = new java.util.HashSet<Article>();
      if (!this.article.contains(newArticle))
         this.article.add(newArticle);
   }
   
   /** @pdGenerated default remove
     * @param oldArticle */
   public void removeArticle(Article oldArticle) {
      if (oldArticle == null)
         return;
      if (this.article != null)
         if (this.article.contains(oldArticle))
            this.article.remove(oldArticle);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllArticle() {
      if (article != null)
         article.clear();
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