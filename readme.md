[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)
[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/licenses/)
[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](http://www.gnu.org/licenses/agpl-3.0)

<a name="TOP"></a>

<a href="#IT"><img style="height:25px" src="https://em-content.zobj.net/thumbs/60/whatsapp/352/flag-italy_1f1ee-1f1f9.png" /></a>
🤍
<a href="#EN"><img style="height:25px" src="https://em-content.zobj.net/thumbs/60/whatsapp/352/flag-united-kingdom_1f1ec-1f1e7.png" /></a>

<hr />


![🇬🇧](https://em-content.zobj.net/thumbs/60/whatsapp/352/flag-united-kingdom_1f1ec-1f1e7.png) <a name="EN"></a>
# CipherMaster 🛡️💻

Welcome to **CipherMaster**, your go-to repository for powerful text encryption using Java's Swing interface and the Vigenère cipher! 🚀✨

## What's Inside? 📦

This repository contains a Java class named [`Cipher`](./src/main/java/model/Cipher.java) that provides two encryption methods:

1. **Vigenère Cipher** 🔑🔢
   - Encrypts or decrypts a given message using the Vigenère cipher algorithm.
   - Supports both uppercase and lowercase letters.
   - Takes a key as an input parameter for enhanced security.

2. **Alphabetic Translation Cipher (*Caesar Cipher*)** 🔄🔠
   - Translates a message by shifting letters in the alphabet.
   - Allows custom translation distances for added flexibility.
   - Handles both uppercase and lowercase letters.

## How to Use 🤔💡

1. **Vigenère Cipher:**
   ```java
   String encrypted = Cipher.vigenere("Come on Napoli", "KEY", true);
   String decrypted = Cipher.vigenere(encrypted, "KEY", false);
   ```

2. **Alphabetic Translation Cipher (*Caesar Cipher*):**
   ```java
   String encrypted = Cipher.cryptTraslateAZ("Come on Napoli", 3);
   ```

Feel free to explore and integrate these encryption functionalities into your projects! 🚀🔒

## User Interface 👩‍💻👨‍💻

This class is designed to be seamlessly integrated with Java Swing GUIs. Connect this cipher engine to your Swing application, and create a user-friendly interface for encrypting and decrypting messages with ease! 🖥️🔐

## Example Integration 🌐💼

```java
// Example of integrating with Swing GUI
// (Assuming Cipher class is appropriately connected to the Swing UI)

String plainText = plainTextArea.getText(); // Get input from the user
String key = keyField.getText(); // Get encryption key

// Encrypt the message using Vigenère cipher
String encryptedText = Cipher.vigenere(plainText, key, true);

// Display the encrypted text in the GUI
cipherTextArea.setText(encryptedText);
```

Feel free to get creative and enhance your projects with CipherMaster's powerful encryption capabilities! 🔐✨

*Happy coding*! 🚀🌟


<hr/>

<a href="#IT"><img style="height:25px" src="https://em-content.zobj.net/thumbs/60/whatsapp/352/flag-italy_1f1ee-1f1f9.png" /></a> 🤍 <a href="#EN"><img style="height:25px" src="https://em-content.zobj.net/thumbs/60/whatsapp/352/flag-united-kingdom_1f1ec-1f1e7.png" /></a>

<hr />


![🇮🇹](https://em-content.zobj.net/thumbs/60/whatsapp/352/flag-italy_1f1ee-1f1f9.png) <a name="IT"></a>
# CipherMaster 🛡️💻

Benvenuti in **CipherMaster**, il tuo repository di riferimento per la potente crittografia di testo utilizzando l'interfaccia Swing di Java e il cifrario di Vigenère! 🚀✨

## Cosa Contiene? 📦

Questo repository contiene una classe Java chiamata [`Cipher`](./src/main/java/model/Cipher.java) che fornisce due metodi di crittografia:

1. **Cifrario di Vigenère** 🔑🔢
   - Crittografa o decrittografa un messaggio dato utilizzando l'algoritmo del cifrario di Vigenère.
   - Supporta lettere maiuscole e minuscole.
   - Richiede una chiave come parametro di input per una sicurezza avanzata.

2. **Cifrario a Traduzione Alfabetica (*cifrario di Cesare*)** 🔄🔠
   - Traduce un messaggio spostando le lettere nell'alfabeto.
   - Consente distanze di traduzione personalizzate per una maggiore flessibilità.
   - Gestisce sia lettere maiuscole che minuscole.

## Come Usare 🤔💡

1. **Cifrario di Vigenère:**
   ```java
   String crittografato = Cipher.vigenere("Forza Napoli", "CHIAVE", true);
   String decrittografato = Cipher.vigenere(crittografato, "CHIAVE", false);
   ```

2. **Cifrario a Traduzione Alfabetica (Cifrario di *Cesare*):**
   ```java
   String crittografato = Cipher.cryptTraslateAZ("Forza Napoli", 3);
   ```

Sentitevi liberi di esplorare e integrare queste funzionalità di crittografia nei vostri progetti! 🚀🔒

## Interfaccia Utente 👩‍💻👨‍💻

Questa classe è progettata per essere integrata senza problemi con le interfacce utente Swing di Java. Collegate questo motore di crittografia alla vostra applicazione Swing e create un'interfaccia utente intuitiva per crittografare e decrittografare messaggi con facilità! 🖥️🔐

## Esempio di Integrazione 🌐💼

```java
// Esempio di integrazione con GUI Swing
// (Assumendo che la classe Cipher sia collegata correttamente all'interfaccia Swing)

String testoChiaro = areaTestoChiaro.getText(); // Ottieni l'input dall'utente
String chiave = campoChiave.getText(); // Ottieni la chiave di crittografia

// Crittografa il messaggio utilizzando il cifrario di Vigenère
String testoCrittografato = Cipher.vigenere(testoChiaro, chiave, true);

// Visualizza il testo crittografato nell'interfaccia grafica
areaTestoCifrato.setText(testoCrittografato);
```

Sentitevi liberi di essere creativi e migliorare i vostri progetti con le potenti capacità di crittografia di CipherMaster! 🔐✨

*Buon coding*! 🚀🌟


<a href="#TOP">&utrif; top &utrif;</a>

## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/biagio-rosario-greco-77145774/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/birg_81)