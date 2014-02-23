/***********************************************************************
 * Module:  Article.java
 * Author:  tasnim
 * Purpose: Defines the Class Article
 ***********************************************************************/

import java.util.*;

/** @pdOid 767d9f50-a5ab-4bd6-a332-d56516daf736 */
public class Article {
   /** @pdOid 76f943bd-8dac-4cd1-8d49-4da667158ad0 */
   private int idArticle;
   /** @pdOid 3816c909-a38b-4965-b53b-7283cb68db34 */
   private String titre;
   /** @pdOid 820f96ff-c67c-4cb1-a027-652b64a0cd27 */
   private String texte;
   /** @pdOid 15a29b33-ee92-461a-a36e-bd933e26f832 */
   private int noteMoy;
   /** @pdOid bf19f017-a8ab-4f3f-8dcc-d87f9a218478 */
   private int nbrVisite;
   /** @pdOid d20a20d8-9d94-4c28-b522-7d59fbfdab54 */
   private Date dateRedaction;
   
   /** @pdRoleInfo migr=no name=Media assc=comporter mult=0..* side=A */
   public Media[] media;
   
   /** @pdOid 8748d841-e73c-4419-8e51-295cec35c4f6 */
   public Article() {
      // TODO: implement
   }
   
   /** @pdOid 81a66eaf-d4e3-4b39-8c08-fdd271611c5a */
   public String getTitre() {
      return titre;
   }
   
   /** @param newTitre
    * @pdOid 4b23df99-48ce-437a-ab77-58f23445154d */
   public void setTitre(String newTitre) {
      titre = newTitre;
   }
   
   /** @pdOid 92716ce3-9ff7-4085-9bb7-050ff2e8dbdb */
   public int getIdArticle() {
      return idArticle;
   }
   
   /** @param newIdArticle
    * @pdOid 7a6dae85-ea60-4728-a7a2-2c18012f02fc */
   public void setIdArticle(int newIdArticle) {
      idArticle = newIdArticle;
   }
   
   /** @pdOid d45cd830-c3d3-403b-8429-894ca8299bb2 */
   public String getTexte() {
      return texte;
   }
   
   /** @param newTexte
    * @pdOid 8f2cc251-41f3-4d6e-964c-33837bbec4d0 */
   public void setTexte(String newTexte) {
      texte = newTexte;
   }
   
   /** @pdOid fdc3bda3-b756-4192-b09f-5e779fdcd297 */
   public int getNoteMoy() {
      return noteMoy;
   }
   
   /** @param newNoteMoy
    * @pdOid 467a93fe-87a6-45fb-b558-47a60fb026f5 */
   public void setNoteMoy(int newNoteMoy) {
      noteMoy = newNoteMoy;
   }
   
   /** @pdOid 6b209a8c-82ff-4026-9317-b91198ea4328 */
   public int getNbrVisite() {
      return nbrVisite;
   }
   
   /** @param newNbrVisite
    * @pdOid a9b98dbb-753a-4b11-b478-0fcf0d900c46 */
   public void setNbrVisite(int newNbrVisite) {
      nbrVisite = newNbrVisite;
   }
   
   /** @pdOid f7e1c60c-ff5f-4165-b131-385b48d66736 */
   public Date getDateRedaction() {
      return dateRedaction;
   }
   
   /** @param newDateRedaction
    * @pdOid ea4733d4-7246-4758-a61c-9c67a5807654 */
   public void setDateRedaction(Date newDateRedaction) {
      dateRedaction = newDateRedaction;
   }
   
   /** @pdOid ae0a0a6f-fcf2-4cac-a290-2a4069b69949 */
   public int create() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid e97597bb-5724-4b02-b9df-51d6f701096c */
   public int update() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 9336238d-ee57-4279-8d29-520dddadff09 */
   public List<Article> read() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid f07fffc9-0417-4d0f-838d-c7847072547f */
   public int delete() {
      // TODO: implement
      return 0;
   }

}