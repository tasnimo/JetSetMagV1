/***********************************************************************
 * Module:  Evenement.java
 * Author:  tasnim
 * Purpose: Defines the Class Evenement
 ***********************************************************************/

import java.util.*;

/** @pdOid 6f7d62c3-326d-48d2-bdf8-83307153dd89 */
public class Evenement {
   /** @pdOid 9b7ed78f-1ac3-4009-a90d-c4f4972d93b6 */
   private int idEvent;
   /** @pdOid f78193f3-c9be-4a5b-8dc3-5d213cf1aa4d */
   private Date dateDebut;
   /** @pdOid ef6325c1-af3b-479d-9af5-615ef162894c */
   private Date dateFin;
   /** @pdOid ebedb6e7-13b4-478b-ab57-a698f78e5379 */
   private String typeEvent;
   /** @pdOid cc7edc1c-3d3c-47a0-9f95-c3753b37d3ae */
   private String description;
   
   /** @pdOid d7752834-8059-4b08-833b-7c24d8ab4c60 */
   public int getIdEvent() {
      return idEvent;
   }
   
   /** @param newIdEvent
    * @pdOid cca0a522-e42f-4803-9e8c-7427b2e8da0d */
   public void setIdEvent(int newIdEvent) {
      idEvent = newIdEvent;
   }
   
   /** @pdOid 93e34529-7cff-4430-8b68-1118b2a683eb */
   public Evenement() {
      // TODO: implement
   }
   
   /** @pdOid cd616408-4fdf-48b1-bfea-fef5184dbe13 */
   public int create() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid ce1745e5-f8c4-4332-9728-797a709b6ae3 */
   public int update() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 4fb31a9a-87d9-49d5-aa83-0c4664885e60 */
   public List<Evenement> read() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid c1527419-dba1-4fea-b132-3f17641676a9 */
   public int delete() {
      // TODO: implement
      return 0;
   }

}