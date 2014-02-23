/***********************************************************************
 * Module:  Projection.java
 * Author:  tasnim
 * Purpose: Defines the Class Projection
 ***********************************************************************/

import java.util.*;

/** @pdOid 8b1283ca-9d0c-46f1-8fd4-4b0fdf828c53 */
public class Projection {
   /** @pdOid b6ff0a78-1399-47ac-ac7b-52cf8cc2ad47 */
   private int idSalle;
   /** @pdOid 5a6b2f4e-2066-43c7-a3bf-aef1395f2092 */
   private Date dateHeure;
   
   /** @pdRoleInfo migr=no name=Cinema assc=association40 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Cinema> cinema;
   /** @pdRoleInfo migr=no name=Film assc=projeter mult=0..* side=A */
   public Film[] film;
   
   /** @pdOid 60c828de-92eb-42d2-b670-441b91bbccd2 */
   public int getIdSalle() {
      return idSalle;
   }
   
   /** @param newIdSalle
    * @pdOid 3e1332c1-39dc-4b6c-8800-858032ebdd6d */
   public void setIdSalle(int newIdSalle) {
      idSalle = newIdSalle;
   }
   
   /** @pdOid 4fb587f9-7c01-4a56-a420-c16f036a7a4f */
   public int create() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 8d455bc0-e0f0-4a7d-bb19-437ba0bbb3e6 */
   public int update() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 642df5e4-9ed4-4aaa-8aaf-b35dc8eba9e2 */
   public static List<Projection> read() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid e9ca1b96-5a28-42af-8afa-b091858b5361 */
   public int delete() {
      // TODO: implement
      return 0;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Cinema> getCinema() {
      if (cinema == null)
         cinema = new java.util.HashSet<Cinema>();
      return cinema;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCinema() {
      if (cinema == null)
         cinema = new java.util.HashSet<Cinema>();
      return cinema.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCinema */
   public void setCinema(java.util.Collection<Cinema> newCinema) {
      removeAllCinema();
      for (java.util.Iterator iter = newCinema.iterator(); iter.hasNext();)
         addCinema((Cinema)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCinema */
   public void addCinema(Cinema newCinema) {
      if (newCinema == null)
         return;
      if (this.cinema == null)
         this.cinema = new java.util.HashSet<Cinema>();
      if (!this.cinema.contains(newCinema))
         this.cinema.add(newCinema);
   }
   
   /** @pdGenerated default remove
     * @param oldCinema */
   public void removeCinema(Cinema oldCinema) {
      if (oldCinema == null)
         return;
      if (this.cinema != null)
         if (this.cinema.contains(oldCinema))
            this.cinema.remove(oldCinema);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCinema() {
      if (cinema != null)
         cinema.clear();
   }

}