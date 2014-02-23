/***********************************************************************
 * Module:  Commentaire.java
 * Author:  tasnim
 * Purpose: Defines the Class Commentaire
 ***********************************************************************/

import java.util.*;

/** @pdOid 1ec616f3-5c4e-4645-a696-5b1063d55411 */
public class Commentaire {
   /** @pdOid 69d8a293-3983-4ba5-9d1a-670c2c46c274 */
   private String messageCom;
   
   /** @pdRoleInfo migr=no name=Article assc=association43 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Article> article;
   /** @pdRoleInfo migr=no name=Film assc=association44 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Film> film;
   /** @pdRoleInfo migr=no name=Evenement assc=association45 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Evenement> evenement;
   /** @pdRoleInfo migr=no name=Membre assc=gerer mult=0..* side=A */
   public Membre[] membre;
   
   /** @pdOid 27acf896-255e-4f8b-99e0-bba74b004071 */
   public String getMessageCom() {
      return messageCom;
   }
   
   /** @param newMessageCom
    * @pdOid 5ff610b8-e7b8-427c-81bf-d7104209e844 */
   public void setMessageCom(String newMessageCom) {
      messageCom = newMessageCom;
   }
   
   /** @pdOid 00962b53-75df-4c3a-80f3-397756b1b049 */
   public Commentaire() {
      // TODO: implement
   }
   
   /** @pdOid c6b77bfb-1512-447f-950c-5ddcfa1fd552 */
   public int create() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid c6272f1a-cca2-4155-bf59-290f09b22ae0 */
   public int update() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 321eae63-924b-4607-aaba-1da1dae2f0d5 */
   public int delete() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 66c9c0fc-a325-42ce-bc7f-4445bfc1e12b */
   public static List<Membre> read() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 07e14ccb-c9ad-4a36-9d15-4c6c15a797b5 */
   public static Membre readById() {
      // TODO: implement
      return null;
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
   public java.util.Collection<Film> getFilm() {
      if (film == null)
         film = new java.util.HashSet<Film>();
      return film;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorFilm() {
      if (film == null)
         film = new java.util.HashSet<Film>();
      return film.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newFilm */
   public void setFilm(java.util.Collection<Film> newFilm) {
      removeAllFilm();
      for (java.util.Iterator iter = newFilm.iterator(); iter.hasNext();)
         addFilm((Film)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newFilm */
   public void addFilm(Film newFilm) {
      if (newFilm == null)
         return;
      if (this.film == null)
         this.film = new java.util.HashSet<Film>();
      if (!this.film.contains(newFilm))
         this.film.add(newFilm);
   }
   
   /** @pdGenerated default remove
     * @param oldFilm */
   public void removeFilm(Film oldFilm) {
      if (oldFilm == null)
         return;
      if (this.film != null)
         if (this.film.contains(oldFilm))
            this.film.remove(oldFilm);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllFilm() {
      if (film != null)
         film.clear();
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