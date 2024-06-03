# ShadowHash - All-in-One-Crypto-Solution

**Comprehensive Cryptographic Toolset for Enhanced Security and Privacy**

## Features

- **Email Breach Checker**: Verify if your email has been part of a recent data breach and receive recommendations to change your password for enhanced security (powered by Hackcheck Woventeams API).
- **Password Breach Checker**: Check if your password has been compromised in a recent data breach. An added security layer involves creating an SHA-1 hash of your password and sending only the first 5 characters of the hash for verification, ensuring your full password remains secure and private (powered by HaveIBeenPwned API).
- **Password Creator**: Generate strong, random passwords or create personalized passwords based on your input. The passwords adhere to best practices, including uppercase, lowercase, alphanumeric characters, and lengths between 8-20 characters.
- **Encryption Decryption Algorithms**: Utilize both asymmetric (RSA) and symmetric (AES, 3DES, Blowfish, and a custom complex ShadowHash algorithm) encryption and decryption methods. Users can generate new keys or use their existing ones.
- **Hash Creator**: Generate hashes using popular algorithms like SHA-1 and MD5.
- **Hash Checker**: Validate data by comparing provided hashes to ensure data integrity.
- **Password Manager**: Securely store and manage your passwords.
- **Virus Detector**: Check files for viruses using the VirusTotal API.

## Installation

Clone the repository and navigate to the project directory:

```bash
git clone https://github.com/yourusername/ShadowHash.git
cd ShadowHash
