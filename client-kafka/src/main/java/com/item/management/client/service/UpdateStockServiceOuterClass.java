// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UpdateStockService.proto

package com.item.management.client.service;

public final class UpdateStockServiceOuterClass {
  private UpdateStockServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_item_management_client_service_UpdateStockRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_item_management_client_service_UpdateStockRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_item_management_client_service_UpdateStockResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_item_management_client_service_UpdateStockResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030UpdateStockService.proto\022\"com.item.man" +
      "agement.client.service\"K\n\022UpdateStockReq" +
      "uest\022\014\n\004type\030\001 \001(\005\022\020\n\010officeId\030\002 \001(\t\022\025\n\r" +
      "serialNumbers\030\003 \003(\t\"\025\n\023UpdateStockRespon" +
      "se2\224\001\n\022UpdateStockService\022~\n\013updateStock" +
      "\0226.com.item.management.client.service.Up" +
      "dateStockRequest\0327.com.item.management.c" +
      "lient.service.UpdateStockResponseB\002P\001b\006p" +
      "roto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_item_management_client_service_UpdateStockRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_item_management_client_service_UpdateStockRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_item_management_client_service_UpdateStockRequest_descriptor,
        new java.lang.String[] { "Type", "OfficeId", "SerialNumbers", });
    internal_static_com_item_management_client_service_UpdateStockResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_item_management_client_service_UpdateStockResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_item_management_client_service_UpdateStockResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}