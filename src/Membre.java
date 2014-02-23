/***********************************************************************
 * Module:  Membre.java
 * Author:  tasnim
 * Purpose: Defines the Class Membre
 ***********************************************************************/

import java.util.*;

/** @pdOid 78121944-756f-48fe-8bc9-5f3d8ce802e5 */
public class Membre {
   /** @pdOid af5caaed-4da3-4307-a040-a8f1774364a2 */
   private int idMembre;
   /** @pdOid 5956f4d4-e472-4364-8b23-2a0fb44de8c1 */
   private int userName;
   /** @pdOid f39ad9db-759a-4f23-91d4-cb1eb06299ff */
   private String nom;
   /** @pdOid 27fe603e-613b-4d16-a737-7fbe7d92c9d1 */
   private String prenom;
   /** @pdOid 9a5b512e-ae19-4a05-8b9e-ae2ba31189e4 */
   private int passwd;
   /** @pdOid c5a3ed4a-2822-4914-8ad4-754c66ee2950 */
   private int email;
   /** @pdOid dc831b76-d1ae-4910-aadd-ecdede64b753 */
   private int isAdmin;
   
   /** @pdRoleInfo migr=no name=Commentaire assc=gerer coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Commentaire> commentaire;
   /** @pdRoleInfo migr=no name=Visite assc=commenter mult=0..* side=A */
   public Visite[] visite;
   
   /** @pdOid 511daf74-7440-4dde-ba4a-9aa1cc5af5c1 */
   public Membre() {
      // TODO: implement
   }
   
   /** @pdOid 5aec352f-786a-4aaf-88f0-a9d68315aa12 */
   public int getIdMembre() {
      return idMembre;
   }
   
   /** @param newIdMembre
    * @pdOid b5f39eea-f67b-4e71-9671-3afe19798d33 */
   public void setIdMembre(int newIdMembre) {
      idMembre = newIdMembre;
   }
   
   /** @pdOid fe7b84ae-d4a1-4b2b-a10c-10d5783ab3dd */
   public String getNom() {
      return nom;
   }
   
   /** @param newNom
    * @pdOid bbdc171e-0ceb-4308-b9e3-ae2bd5d1b77d */
   public void setNom(String newNom) {
      nom = newNom;
   }
   
   /** @pdOid 8b679f4e-d540-4683-aede-9efda9d4512d */
   public String getPrenom() {
      return prenom;
   }
   
   /** @param newPrenom
    * @pdOid 2cc99894-1fd1-41b7-8836-df7a4ba6be9b */
   public void setPrenom(String newPrenom) {
      prenom = newPrenom;
   }
   
   /** @pdOid 85a455f6-d54f-48b3-85d8-b87c01f4f818 */
   public int getUserName() {
      return userName;
   }
   
   /** @param newUserName
    * @pdOid 05783f1f-b697-4879-b043-b98a4fd19d51 */
   public void setUserName(int newUserName) {
      userName = newUserName;
   }
   
   /** @pdOid 0c127dd2-2f45-42b5-8643-604f6cf1ac61 */
   public int getPasswd() {
      return passwd;
   }
   
   /** @param newPasswd
    * @pdOid 7a9d0fc4-3922-4d9a-acf8-250113ad69db */
   public void setPasswd(int newPasswd) {
      passwd = newPasswd;
   }
   
   /** @pdOid 35e3f671-fb22-4197-9a19-cb78a080825f */
   public int getEmail() {
      return email;
   }
   
   /** @param newEmail
    * @pdOid 4422c6bf-3c72-47c9-80ec-12f0a7677a95 */
   public void setEmail(int newEmail) {
      email = newEmail;
   }
   
   /** @pdOid 82ca2776-1de8-4463-adb5-914acddf3432 */
   public int getIsAdmin() {
      return isAdmin;
   }
   
   /** @param newIsAdmin
    * @pdOid ebec61c1-59ac-4833-abc9-d4f5698b8ea2 */
   public void setIsAdmin(int newIsAdmin) {
      isAdmin = newIsAdmin;
   }
   
   /** @pdOid a53db761-c239-45e7-bc1b-4c415d378ebf */
   public int create() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid e3468612-2253-4fbe-b7de-127163accc5e */
   public int update() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid e653529e-962e-4c9e-aae8-28702309f6fe */
   public int delete() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 6d3439b7-d212-4621-8688-644f9c5e5823 */
   public static List<Membre> read() {
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