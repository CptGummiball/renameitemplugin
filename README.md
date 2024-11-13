# RenameItemPlugin

**RenameItemPlugin** ist ein Minecraft-Plugin (Spigot Forks) für Version 1.21+, das es Spielern mit einer bestimmten Berechtigung erlaubt, das Item in ihrer Hand umzubenennen.

## Installation

1. Lade den passenden [Release](https://github.com/CptGummiball/renameitemplugin/releases) herunter.
2. Kopiere die `.jar`-Datei in den `plugins`-Ordner deines Minecraft-Servers.
3. Starte den Server neu oder lade das Plugin mit `/reload` neu.

## Nutzung

Mit dem Befehl `/renameitem <neuername>` kann das Item in der Haupthand des Spielers umbenannt werden.

### Beispiel

Um ein Item in der Hand in „Magisches Schwert“ umzubenennen, nutze: `/renameitem Magisches Schwert`


### Unterstützung von Farben

Das Plugin unterstützt Farbcodes. Verwende `&` gefolgt von einem Farbbuchstaben oder einer Zahl (z.B. `&a` für hellgrün): `/renameitem &aMagisches &bSchwert`

Dies würde das Item in der Hand in **Magisches Schwert** (hellgrün und aqua) umbenennen.

## Befehle und Berechtigungen

- **Befehl**: `/renameitem <neuername>`  
  Benennt das Item in der Haupthand des Spielers mit dem angegebenen Namen um.

- **Berechtigung**: `renameitem.use`  
  Erlaubt es dem Spieler, den Befehl `/renameitem` zu verwenden. Diese Berechtigung ist standardmäßig nur für OPs aktiviert.

## Hinweise

- Der Spieler muss ein Item in der Hand halten, um es umzubenennen.
- Spieler ohne die Berechtigung `renameitem.use` erhalten eine Fehlermeldung.
- Das Plugin funktioniert ausschließlich mit Spigot Forks ab Version 1.21
- Getestet wurde mit Spigot 1.21.1 und PaperMC 1.21.1 (build #131)
- Das Plugin ist aktuell nur auf Deutsch verfügbar

## Lizenz

Dieses Projekt ist unter der MIT-Lizenz lizenziert. Weitere Informationen findest du in der [Lizenzdatei](LICENSE).
