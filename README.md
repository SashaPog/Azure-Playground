# 🔐 Azure Key Vault Playground

This project demonstrates how to retrieve secrets from **Azure Key Vault** in a local development environment.  
You’ll learn how to configure Azure resources, authenticate with Azure, and run the application directly from IntelliJ IDEA.

---

## 🚀 Overview

The app connects to an Azure Key Vault instance and reads secrets using the Azure SDK.  
You can authenticate in two ways:

1. **Azure CLI Authentication** — uses your logged-in Azure user (`az login`).
2. **Service Principal Authentication** — uses `Client ID`, `Tenant ID`, and `Client Secret` via environment variables.

---

## 🧩 Requirements

- Azure account
- Azure CLI installed  
- Java 21 
- IntelliJ IDEA  
- Git

---

## Create a Resource Group

## Create a Key Vault

## Add a Secret

## Register an Application in Azure Entra id and create Client Secret

## take client tenant secret ids and take keyVaultUrl

## Grant Access to the Key Vault for application

## Two Ways to Run the App

1. Option 1
- Log in:
az login

-Open application.properties and comment out these three lines:
spring.cloud.azure.credential.client-id=...
spring.cloud.azure.credential.client-secret=...
spring.cloud.azure.profile.tenant-id=...

2. Option 2: Using Environment Variables

If you don’t want to use az login, set credentials manually.

In IntelliJ IDEA:
Run → Edit Configurations → Environment variables:

AZURE_CLIENT_ID=<your-appId>
AZURE_TENANT_ID=<your-tenantId>
AZURE_CLIENT_SECRET=<your-password>
KEY_VAULT_NAME=kv-demo-playground

Then run the app normally.

update readme