/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2015 Caprica Software Limited.
 */

package by.vr.slplayer.view.action.mediaplayer;

import uk.co.caprica.vlcj.player.MediaPlayer;
import by.vr.slplayer.view.action.Resource;
import by.vr.slplayer.view.action.StandardAction;

abstract class MediaPlayerAction extends StandardAction {

    protected final MediaPlayer mediaPlayer;

    MediaPlayerAction(Resource resource, MediaPlayer mediaPlayer) {
        super(resource);
        this.mediaPlayer = mediaPlayer;
    }

    MediaPlayerAction(String name, MediaPlayer mediaPlayer) {
        super(name);
        this.mediaPlayer = mediaPlayer;
    }
}
