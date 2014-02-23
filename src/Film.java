/***********************************************************************
 * Module:  Film.java
 * Author:  tasnim
 * Purpose: Defines the Class Film
 ***********************************************************************/

import java.util.*;

/** @pdOid 1d609c61-e005-449e-833a-3a94d2902a25 */
public class Film {
   /** @pdOid c2c8a3c3-d881-4a9d-a984-2ca890b0940e */
   private int idFilm;
   /** @pdOid a014e433-61ef-432a-bccb-711929ffd591 */
   private Date dateSortie;
   /** @pdOid 2102635b-fd9b-4f49-8597-c4040ccf5af4 */
   private String synopsis;
   /** @pdOid 95e76109-d62b-4165-9bca-83bbf45ae409 */
   private Date dateAjout;
   
   /** @pdRoleInfo migr=no name=Projection assc=projeter coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Projection> projection;
   /** @pdRoleInfo migr=no name=Media assc=comporter coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Media> media;
   /** @pdRoleInfo migr=no name=Production assc=association32 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Production> production;
   
   /** @pdOid ba7e3a74-cc2c-4666-a368-c944aa13455d */
   public Date getDateSortie() {
      return dateSortie;
   }
   
   /** @param newDateSortie
    * @pdOid 2068b0e8-9718-41f6-b64e-4ed631d1e254 */
   public void setDateSortie(Date newDateSortie) {
      dateSortie = newDateSortie;
   }
   
   /** @pdOid c8b6ae5d-be7b-415f-b7ae-b8ae4b088df1 */
   public int create() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 2f4bac56-c72f-4bd5-94c2-c170aefc1fae */
   public int update() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid e3883aa8-590d-453c-8c2f-c46cf64a3268 */
   public int delete() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid b67508bf-0c8d-481f-907a-211366ced46f */
   public static int read() {
      // TODO: implement
      return 0;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Projection> getProjection() {
      if (projection == null)
         projection = new java.util.HashSet<Projection>();
      return projection;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProjection() {
      if (projection == null)
         projection = new java.util.HashSet<Projection>();
      return projection.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newProjection */
   public void setProjection(java.util.Collection<Projection> newProjection) {
      removeAllProjection();
      for (java.util.Iterator iter = newProjection.iterator(); iter.hasNext();)
         addProjection((Projection)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newProjection */
   public void addProjection(Projection newProjection) {
      if (newProjection == null)
         return;
      if (this.projection == null)
         this.projection = new java.util.HashSet<Projection>();
      if (!this.projection.contains(newProjection))
         this.projection.add(newProjection);
   }
   
   /** @pdGenerated default remove
     * @param oldProjection */
   public void removeProjection(Projection oldProjection) {
      if (oldProjection == null)
         return;
      if (this.projection != null)
         if (this.projection.contains(oldProjection))
            this.projection.remove(oldProjection);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProjection() {
      if (projection != null)
         projection.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Media> getMedia() {
      if (media == null)
         media = new java.util.HashSet<Media>();
      return media;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMedia() {
      if (media == null)
         media = new java.util.HashSet<Media>();
      return media.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMedia */
   public void setMedia(java.util.Collection<Media> newMedia) {
      removeAllMedia();
      for (java.util.Iterator iter = newMedia.iterator(); iter.hasNext();)
         addMedia((Media)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMedia */
   public void addMedia(Media newMedia) {
      if (newMedia == null)
         return;
      if (this.media == null)
         this.media = new java.util.HashSet<Media>();
      if (!this.media.contains(newMedia))
         this.media.add(newMedia);
   }
   
   /** @pdGenerated default remove
     * @param oldMedia */
   public void removeMedia(Media oldMedia) {
      if (oldMedia == null)
         return;
      if (this.media != null)
         if (this.media.contains(oldMedia))
            this.media.remove(oldMedia);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMedia() {
      if (media != null)
         media.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Production> getProduction() {
      if (production == null)
         production = new java.util.HashSet<Production>();
      return production;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProduction() {
      if (production == null)
         production = new java.util.HashSet<Production>();
      return production.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newProduction */
   public void setProduction(java.util.Collection<Production> newProduction) {
      removeAllProduction();
      for (java.util.Iterator iter = newProduction.iterator(); iter.hasNext();)
         addProduction((Production)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newProduction */
   public void addProduction(Production newProduction) {
      if (newProduction == null)
         return;
      if (this.production == null)
         this.production = new java.util.HashSet<Production>();
      if (!this.production.contains(newProduction))
         this.production.add(newProduction);
   }
   
   /** @pdGenerated default remove
     * @param oldProduction */
   public void removeProduction(Production oldProduction) {
      if (oldProduction == null)
         return;
      if (this.production != null)
         if (this.production.contains(oldProduction))
            this.production.remove(oldProduction);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProduction() {
      if (production != null)
         production.clear();
   }

}