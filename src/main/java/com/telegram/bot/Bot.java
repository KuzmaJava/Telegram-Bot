package com.telegram.bot;

import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class Bot extends DefaultAbsSender {

    protected Bot(DefaultBotOptions options) {
        super(options);
    }

    public String getBotToken() {
        return "5271581829:AAFCbSoESr62mWALAuBleeYPp8etsjKTU4g";
    }
    @SneakyThrows
    public static void main(String[] args) {
        Bot bot = new Bot(new DefaultBotOptions());
        bot.execute(SendMessage.builder().chatId("296368223").text("Buenos tardes!").build());
    }

}
