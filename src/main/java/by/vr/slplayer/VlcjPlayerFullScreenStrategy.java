package by.vr.slplayer;

import static by.vr.slplayer.Application.application;

import java.awt.Window;

import uk.co.caprica.vlcj.player.embedded.DefaultAdaptiveRuntimeFullScreenStrategy;
import by.vr.slplayer.event.AfterExitFullScreenEvent;
import by.vr.slplayer.event.BeforeEnterFullScreenEvent;

final class VlcjPlayerFullScreenStrategy extends DefaultAdaptiveRuntimeFullScreenStrategy {

    VlcjPlayerFullScreenStrategy(Window window) {
        super(window);
    }

    @Override
    protected void beforeEnterFullScreen() {
        application().post(BeforeEnterFullScreenEvent.INSTANCE);
    }

    @Override
    protected  void afterExitFullScreen() {
        application().post(AfterExitFullScreenEvent.INSTANCE);
    }
}
