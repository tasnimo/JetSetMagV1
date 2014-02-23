/***********************************************************************
 * Module:  Note.java
 * Author:  tasnim
 * Purpose: Defines the Class Note
 ***********************************************************************/

import java.util.*;

/** @pdOid c6c9ded4-4e6d-423a-b814-b526a59308fc */
public class Note {
   /** @pdOid 9858d312-6ff5-4d29-a6a1-782aaf3372e9 */
   private int nbreEtoile;
   /** @pdOid 3dca8f96-46dd-4307-8dd0-30a3c2e59fc0 */
   private Date dateNote;
   
   /** @pdRoleInfo migr=no name=Film assc=association33 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Film> film;
   /** @pdRoleInfo migr=no name=Evenement assc=association41 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Evenement> evenement;
   /** @pdRoleInfo migr=no name=Article assc=association42 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Article> article;
   
   /** @pdOid 9e1a6217-5d0b-4b5c-8d88-d44a2581a203 */
   public Date getDateNote() {
      return dateNote;
   }
   
   /** @param newDateNote
    * @pdOid bfec44c8-d028-411b-bc9e-03acf5d5c73e */
   public void setDateNote(Date newDateNote) {
      dateNote = newDateNote;
   }
   
   /** @pdOid ac90f405-08b8-48f4-b777-15627f7cf22f */
   public int create() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 84af3ab9-8307-4a6d-9dfd-62aec9fe54d4 */
   public int update() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid eb486a8c-774b-4620-a6d3-3dab317e5bcf */
   public static List<Note> read() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 75e5c529-527c-480f-a13a-add57b3b1d0b */
   public int delete() {
      // TODO: implement
      return 0;
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

}