#!/bin/bash

set -e

WINDOWS_FONTS_DIR="/mnt/Windows/Windows/Fonts/"

echo "Creating ~/.config/fontconfig and ~/.local/share/fonts folders"
mkdir -p ~/.config/fontconfig ~/.local/share/fonts

echo "Writing EmbeddedBitmap filter to ~/.config/fontconfig/fonts.conf"
cat > ~/.config/fontconfig/fonts.conf << EOL
<?xml version="1.0"?>
<!DOCTYPE fontconfig SYSTEM "fonts.dtd">
<fontconfig>
  <match target="font">
    <edit name="embeddedbitmap" mode="assign">
      <bool>false</bool>
    </edit>
  </match>
</fontconfig>
EOL

echo "Creating symlink for $WINDOWS_FONTS_DIR in ~/.local/share/fonts/WindowsFonts"
ln -sfn $WINDOWS_FONTS_DIR ~/.local/share/fonts/WindowsFonts

echo "Refreshing font cache. Please wait..."
fc-cache -f

read -p "Press enter to continue."
