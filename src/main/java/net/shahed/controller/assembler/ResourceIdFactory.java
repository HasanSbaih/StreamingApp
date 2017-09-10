package net.shahed.controller.assembler;

import net.shahed.business.bean.Product;

// Encapsulate the logic to get the resource ID out of the domain entity
public abstract class ResourceIdFactory {

   public static String getId(Product product) {
      return product.getId().toString();
   }

}
