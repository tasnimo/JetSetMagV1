/***********************************************************************
 * Module:  S_authentifier.java
 * Author:  tasnim
 * Purpose: Defines the Class S_authentifier
 ***********************************************************************/

import java.util.*;

/** @pdOid 759d56b1-5251-40fe-86f7-89b4cf5ef4ae */
public class S_authentifier {
   /** @pdRoleInfo migr=no name=InterfaceAuthentification assc=association59 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceAuthentification> interfaceAuthentification;
   
   /** @pdOid 60b30851-ee0e-4b25-a207-2bc7f0c9ced4 */
   public Membre lireMembre() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid c2b06eff-3fe5-4404-97a6-8d708f55cd71 */
   public int verifierLogin() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 40c9fb37-e8ba-4944-a12f-4aaef9994044 */
   public int verfierPasswd() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 293e4982-8f39-4aca-9ce8-67b531780ca4 */
   public int redirigerPage() {
      // TODO: implement
      return 0;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceAuthentification> getInterfaceAuthentification() {
      if (interfaceAuthentification == null)
         interfaceAuthentification = new java.util.HashSet<InterfaceAuthentification>();
      return interfaceAuthentification;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceAuthentification() {
      if (interfaceAuthentification == null)
         interfaceAuthentification = new java.util.HashSet<InterfaceAuthentification>();
      return interfaceAuthentification.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceAuthentification */
   public void setInterfaceAuthentification(java.util.Collection<InterfaceAuthentification> newInterfaceAuthentification) {
      removeAllInterfaceAuthentification();
      for (java.util.Iterator iter = newInterfaceAuthentification.iterator(); iter.hasNext();)
         addInterfaceAuthentification((InterfaceAuthentification)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceAuthentification */
   public void addInterfaceAuthentification(InterfaceAuthentification newInterfaceAuthentification) {
      if (newInterfaceAuthentification == null)
         return;
      if (this.interfaceAuthentification == null)
         this.interfaceAuthentification = new java.util.HashSet<InterfaceAuthentification>();
      if (!this.interfaceAuthentification.contains(newInterfaceAuthentification))
         this.interfaceAuthentification.add(newInterfaceAuthentification);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceAuthentification */
   public void removeInterfaceAuthentification(InterfaceAuthentification oldInterfaceAuthentification) {
      if (oldInterfaceAuthentification == null)
         return;
      if (this.interfaceAuthentification != null)
         if (this.interfaceAuthentification.contains(oldInterfaceAuthentification))
            this.interfaceAuthentification.remove(oldInterfaceAuthentification);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceAuthentification() {
      if (interfaceAuthentification != null)
         interfaceAuthentification.clear();
   }

}